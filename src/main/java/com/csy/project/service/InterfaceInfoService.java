package com.csy.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.csy.csyapicommon.model.entity.InterfaceInfo;
import com.csy.project.model.entity.Post;

/**
* @author csy
* @description 针对表【interface_info(接口信息)】的数据库操作Service
*
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
