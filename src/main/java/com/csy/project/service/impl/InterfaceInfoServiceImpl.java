package com.csy.project.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csy.project.common.ErrorCode;
import com.csy.project.exception.BusinessException;
import com.csy.csyapicommon.model.entity.InterfaceInfo;
import com.csy.project.mapper.InterfaceInfoMapper;
import com.csy.project.model.entity.Post;
import com.csy.project.model.enums.PostGenderEnum;
import com.csy.project.model.enums.PostReviewStatusEnum;
import com.csy.project.service.InterfaceInfoService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 18043
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-02-12 13:44:46
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {

        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        //todo
        String name = interfaceInfo.getName();
        String description = interfaceInfo.getDescription();
        String url = interfaceInfo.getUrl();
        String requestParams = interfaceInfo.getRequestParams();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();
        Integer status = interfaceInfo.getStatus();
        String method = interfaceInfo.getMethod();
        Long userId = interfaceInfo.getUserId();
        Date createTime = interfaceInfo.getCreateTime();
        Date updateTime = interfaceInfo.getUpdateTime();
        Integer isDelete = interfaceInfo.getIsDelete();
        // 创建时，所有参数必须非空
//        if (add) {
//            if (StringUtils.isAnyBlank(content, job, place, education, loveExp) || ObjectUtils.anyNull(age, gender)) {
//                throw new BusinessException(ErrorCode.PARAMS_ERROR);
//            }
//        }
//        if (StringUtils.isNotBlank(content) && content.length() > 8192) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "内容过长");
//        }
//        if (reviewStatus != null && !PostReviewStatusEnum.getValues().contains(reviewStatus)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        if (age != null && (age < 18 || age > 100)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "年龄不符合要求");
//        }
//        if (gender != null && !PostGenderEnum.getValues().contains(gender)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "性别不符合要求");
//        }
    }
}




