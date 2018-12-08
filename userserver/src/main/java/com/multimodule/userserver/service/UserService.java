package com.multimodule.userserver.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.multimodule.userserver.domain.SysUser;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/12 17:50
 * @Version: 1.0
 */
public interface UserService extends IService<SysUser> {

    public SysUser gainUserById(String id);

    public List<SysUser> gainUserList(String code);

    public IPage<SysUser> gainUserPageList(IPage<SysUser> page, String code);

    public List<SysUser> gainUserListToCachAndView();

    public String updteUser(SysUser u , String usercode);
}
