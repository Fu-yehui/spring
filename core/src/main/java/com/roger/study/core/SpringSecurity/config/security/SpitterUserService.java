package com.roger.study.core.SpringSecurity.config.security;

import com.roger.study.core.spring_web.spittr.data.Spittle;
import com.roger.study.core.spring_web.spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 就是在登录时的认证操作交给Spring Security.
 *
 * 在此处需要提供给当前登录用户所拥有的权限。
 *

 */
public class SpitterUserService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        List<GrantedAuthority> authorityList=new ArrayList<GrantedAuthority>();
        authorityList.add(new SimpleGrantedAuthority("ROLE_SPITTER"));

        User user=new User(userName,"111",authorityList);
        return user;



    }
}
