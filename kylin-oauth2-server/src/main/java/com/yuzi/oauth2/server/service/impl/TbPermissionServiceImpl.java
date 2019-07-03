package com.yuzi.oauth2.server.service.impl;

import com.yuzi.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yuzi.oauth2.server.dao.TbPermissionMapper;
import com.yuzi.oauth2.server.service.TbPermissionService;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;


    @Override
    public List<TbPermission> getPermissionByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
