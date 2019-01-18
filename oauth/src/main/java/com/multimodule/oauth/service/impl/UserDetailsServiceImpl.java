package com.multimodule.oauth.service.impl;

import com.multimodule.oauth.domain.SysUser;
import com.multimodule.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: UserDetailsServiceImpl
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/25 17:34
 * @Version: 1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<SysUser> list=userService.getUser(s);
        //判断这个用户是不是存在
        if(list.size()==0){
            throw new UsernameNotFoundException("用户:" + s + ",不存在!");
        }

        //封装角色，角色菜单的数据
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        boolean enabled = true; // 可用性 :true:可用 false:不可用
        boolean accountNonExpired = true; // 过期性 :true:没过期 false:过期
        boolean credentialsNonExpired = true; // 有效性 :true:凭证有效 false:凭证无效
        boolean accountNonLocked = true; // 锁定性 :true:未锁定 false:已锁定

        //权限数据封装的模版
//        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_");
//        grantedAuthorities.add(grantedAuthority);

        User user = new User(list.get(0).getName(), list.get(0).getPassword(),
                enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthorities);

        return user;
    }
}
