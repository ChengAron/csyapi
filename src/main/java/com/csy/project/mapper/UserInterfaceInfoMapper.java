package com.csy.project.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csy.csyapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息 Mapper
 *
 * @author csy
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




