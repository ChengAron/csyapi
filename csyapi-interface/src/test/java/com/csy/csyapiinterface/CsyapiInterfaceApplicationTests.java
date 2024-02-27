package com.csy.csyapiinterface;

import com.csy.csyapiclientsdk.client.CsyApiClient;
import com.csy.csyapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CsyapiInterfaceApplicationTests {

    @Resource
    private CsyApiClient csyApiClient;

    @Test
    void contextLoads() {
        String result = csyApiClient.getNameByGet("csy");
        User user = new User();
        user.setUsername("成师亿");
        String usernameByPost = csyApiClient.getUsernameByPost(user);
        System.out.println("ad");
        System.out.println(result);
        System.out.println(usernameByPost);
    }
}
