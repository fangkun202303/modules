package com.multimodule.oauth.service.impl;

import com.multimodule.oauth.dao.UserMapper;
import com.multimodule.oauth.domain.SysUser;
import com.multimodule.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/25 17:22
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<SysUser> getUser(String userName) {
        List<SysUser> list = userMapper.getUser(userName);
        return list;
    }
}
