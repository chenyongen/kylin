package com.yuzi.oauth2.server.service;

import com.yuzi.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{

    List<TbPermission> getPermissionByUserId(Long userId);
}
