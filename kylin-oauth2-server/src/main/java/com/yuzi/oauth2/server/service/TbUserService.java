package com.yuzi.oauth2.server.service;

import com.yuzi.oauth2.server.domain.TbUser;

public interface TbUserService{

    TbUser getByUserName(String username);
}
