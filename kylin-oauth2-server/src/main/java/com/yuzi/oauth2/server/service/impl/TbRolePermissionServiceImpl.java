package com.yuzi.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yuzi.oauth2.server.dao.TbRolePermissionMapper;
import com.yuzi.oauth2.server.service.TbRolePermissionService;
@Service
public class TbRolePermissionServiceImpl implements TbRolePermissionService{

    @Resource
    private TbRolePermissionMapper tbRolePermissionMapper;

}
