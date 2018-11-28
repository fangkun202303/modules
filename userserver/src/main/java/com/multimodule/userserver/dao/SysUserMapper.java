package com.multimodule.userserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.multimodule.userserver.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

     List<SysUser> gainUserList(@Param("code") String code);

     //List<SysUser> gainUserPage(Page page,@Param("code")String code);

//     List<SysUser> gainUserPageList(@Param("param") Map param);
//     List<SysUser> gainUserPageList(@Param("code") String code, @Param("start")Integer start, @Param("end")Integer end );
     List<SysUser> gainUserPageList(@Param("param") Map<String, Object> param);

}