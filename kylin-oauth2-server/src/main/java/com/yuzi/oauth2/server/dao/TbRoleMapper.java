package com.yuzi.oauth2.server.dao;

import com.yuzi.oauth2.server.domain.TbRole;

public interface TbRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Long id);
}