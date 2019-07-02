package com.yuzi.oauth2.server.dao;

import com.yuzi.oauth2.server.domain.TbUser;

public interface TbUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);


    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}