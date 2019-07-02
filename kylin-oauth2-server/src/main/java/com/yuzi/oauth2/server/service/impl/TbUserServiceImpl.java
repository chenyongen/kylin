package com.yuzi.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yuzi.oauth2.server.dao.TbUserMapper;
import com.yuzi.oauth2.server.service.TbUserService;
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

}
