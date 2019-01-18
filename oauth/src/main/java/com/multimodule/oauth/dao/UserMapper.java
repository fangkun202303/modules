package com.multimodule.oauth.dao;

import com.multimodule.oauth.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/26 10:50
 * @Version: 1.0
 */
@Mapper
@Repository
public interface UserMapper {
    public List<SysUser> getUser(@Param("userName") String userName);
}
