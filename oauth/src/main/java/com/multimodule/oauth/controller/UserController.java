package com.multimodule.oauth.controller;

import com.multimodule.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/26 10:41
 * @Version: 1.0
 */
@Controller
@RequestMapping("/oauthUser")
public class UserController {

    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public Principal getUser(Principal user){
        return user;
    }

    @RequestMapping("/exit")
    @ResponseBody
    public Map<String,Object> loginOut(@RequestParam String access_token){
        Map<String,Object> map =new HashMap<>();
        if(consumerTokenServices.revokeToken(access_token)){
            map.put("code","200");
            map.put("Msg","注销成功！");
        }else{
            map.put("code","400");
            map.put("Msg","注销失败！");
        }
        return map;

    }

}
