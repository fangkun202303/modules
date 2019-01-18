package com.multimodule.oauth.service;

import com.multimodule.oauth.domain.SysUser;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/25 17:22
 * @Version: 1.0
 */
public interface UserService {
    public List<SysUser> getUser(String userName);
}
