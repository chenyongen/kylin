package com.yuzi.oauth2.server.config.service;

import com.yuzi.oauth2.server.domain.TbPermission;
import com.yuzi.oauth2.server.domain.TbUser;
import com.yuzi.oauth2.server.service.TbPermissionService;
import com.yuzi.oauth2.server.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private TbPermissionService tbPermissionService;


    @Autowired
    private TbUserService tbUserService;
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        TbUser user = tbUserService.getByUserName(name);
        List<GrantedAuthority> authorityList = new ArrayList<>();

        List<TbPermission> tbPermissionList = tbPermissionService.getPermissionByUserId(user.getId());

        tbPermissionList
                .forEach(tbPermission -> {

                   GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                   authorityList.add(grantedAuthority);
                });
        return new User(user.getUsername(),user.getPassword(),authorityList);
    }


}
