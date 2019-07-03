package com.yuzi.oauth2.server.dao;

import com.yuzi.oauth2.server.domain.TbPermission;
import com.yuzi.oauth2.server.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission>  selectByUserId(@Param("id") Long userId);
}