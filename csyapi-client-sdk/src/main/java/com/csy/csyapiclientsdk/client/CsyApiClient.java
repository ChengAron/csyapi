package com.csy.csyapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.csy.csyapiclientsdk.model.User;
import com.csy.csyapiclientsdk.utils.SignUtils;


import java.util.HashMap;
import java.util.Map;

/**
 * 调用第三方接口的客户端
 */
public class CsyApiClient {

    public static final String GATEWAY_HOST = "http://localhost:8090";
    private String accessKey;
    private String secretKey;

    public CsyApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        Map<String,Object> parmsMap = new HashMap<>();
        parmsMap.put("name", name);
        String result = HttpUtil.get(GATEWAY_HOST + "/api/name/get" , parmsMap);
        return result;
    }

    public String getNameByPost(String name) {
        Map<String,Object> parmsMap = new HashMap<>();
        parmsMap.put("name", name);
        String result = HttpUtil.post(GATEWAY_HOST + "/api/name/post" , parmsMap);
        return result;
    }

    public String getUsernameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        String result = httpResponse.body();
        return result;
    }

    private Map<String,String> getHeaderMap(String body) {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("accessKey",accessKey);
        hashMap.put("nonce",RandomUtil.randomNumbers(4));
        hashMap.put("body",body);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()/1000));
        hashMap.put("sign", SignUtils.getSign(body,secretKey));
        return hashMap;
    }

}
