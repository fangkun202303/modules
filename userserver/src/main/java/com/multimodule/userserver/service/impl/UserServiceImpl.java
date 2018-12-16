package com.multimodule.userserver.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.multimodule.userserver.dao.SysUserMapper;
import com.multimodule.userserver.domain.SysUser;
import com.multimodule.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/12 17:56
 * @Version: 1.0
 */
@Service
//@Transactional(readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements UserService {

    @Autowired
    private RestTemplate rest;

    //每页的条数
    private final Integer pageSize=20;
    @Autowired
    public SysUserMapper sysUserMapper;

    @Override
    public SysUser gainUserById(String id) {
        //首先判断缓存中存储数据了没
        SysUser u =baseMapper.selectById(id);
        return u;
    }

    @Override
    public List<SysUser> gainUserList(String code) {
        return baseMapper.gainUserList(code);
    }

    @Override
    public IPage<SysUser> gainUserPageList(IPage<SysUser> page, String code) {
        //获取以CZ开头的用户的总记录数
        Integer count = baseMapper.selectCount(new QueryWrapper<SysUser>().likeRight("USERCODE", "CZ"));
        int total = (int) Math.floor((double)count/pageSize);
        page.setTotal(count);
        page.setSize(pageSize);
        page.setPages(total);
        Integer start=Integer.parseInt(String.valueOf((page.getCurrent()-1)*pageSize+1));
        Integer end=Integer.parseInt(String.valueOf(page.getCurrent()*pageSize+1));
        Map<String,Object> param= new HashMap<>();
        param.put("code",code);
        param.put("start",start);
        param.put("end",end);
        page.setRecords(baseMapper.gainUserPageList(param));
        return page;

    }

    /**
     * @MethodName gainUserListToCachAndView
     * @Description 将sys_user这张表的数据都存储到redis中的名称：users的列表中
     * @param
     * @Return java.util.List<com.mybatisplus.domain.SysUser>
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 16:42
     */
    @Override
    public List<SysUser> gainUserListToCachAndView(){
        List<SysUser> list=baseMapper.selectList(null);
        Map<String,Object> map =new HashMap<>();
        map.put("key","users");
        //将这个用户的集合放入到缓存中
//        for (SysUser u: list) {
//            System.out.println(JSON.toJSONString(u));
//            map.put("item",u.getId());
//            map.put("value",u);
//            redisRest.setValue(map);
//        }
        return list;
    }

    @Transactional
    @Override
    public String updteUser(SysUser u, String usercode) {
        u.setName("总公司CZ00");
        int code = baseMapper.update(u, new UpdateWrapper<SysUser>().eq("USERCODE", usercode));
        int i=1/0;
        return code+"";
    }
}
