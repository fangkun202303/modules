package com.multimodule.userserver.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.multimodule.userserver.domain.SysUser;
import com.multimodule.userserver.restInterface.RedisRestInterface;
import com.multimodule.userserver.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/13 8:22
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
@RefreshScope  //开启更新配置的功能
public class UserController {

    private static Logger lg= LoggerFactory.getLogger(IndexController.class);

    //====== 测试配置之心的代码区 START
    @Value("${from}")
    private String fromValue;

    /**
     * 返回配置文件中的值
     */
    @RequestMapping("/from")
    @ResponseBody
    public String returnFormValue(){
        lg.info("from对应的值："+fromValue);
        return fromValue;
    }
    //====== 测试配置之心的代码区 END

    @Autowired
    public RedisRestInterface redisRest;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/gainUserById")
    @ResponseBody
    public String gainUserListById(@RequestParam String id){
        Map<String,Object> map =new HashMap<>();
        map.put("key","users");
        map.put("item",id);
        String s = redisRest.gainValue(map);
        if(s.equals("null")){
            SysUser user=userService.gainUserById(id);
            map.put("value",JSON.toJSONString(user));
            String code=redisRest.setValue(map);
            s=JSON.toJSONString(user);
        }
        return s;
    }

    @RequestMapping(value = "/gainUserList")
    @ResponseBody
    public String gainUserList(@RequestParam String code){
        List<SysUser> list=userService.gainUserList(code);
        return JSON.toJSONString(list);
    }

    @RequestMapping(value = "/gainUserPageList")
    @ResponseBody
    public String gainUserPageList(@RequestParam String code,@RequestParam Integer pageNum){
        IPage<SysUser> page=new Page<>();
        page.setCurrent(pageNum);
        IPage<SysUser> mapIPage = userService.gainUserPageList(page, code);
        return JSON.toJSONString(mapIPage);
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(@RequestParam Map<String, Object> model, @RequestParam HttpRequest request){
        System.out.println(model.get("username"));
        System.out.println(model.get("password"));

        ModelAndView mav = new ModelAndView("success");
        mav.addObject("success", "Login Success ! ");
        return  mav;
    }

    @RequestMapping(value = "/gainUserListToCachAndView")
    @ResponseBody
    public String gainUserListToCachAndView(){
        List<SysUser> list=userService.gainUserListToCachAndView();
        String s = redisRest.setValues(list, "users");
        if(s.equals("200")){
            System.out.println("成功将数据保存到缓存中！");
        }else{
            System.out.println(s);
        }
        return JSON.toJSONString(userService.gainUserListToCachAndView());
    }

    @RequestMapping(value = "/updteUser")
    @ResponseBody
    public String updteUser(){
        SysUser user = userService.gainUserById("CZ00");
        String s = userService.updteUser(user, user.getUsercode());
        return s;
    }

}
