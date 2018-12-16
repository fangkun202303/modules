package com.multimodule.modulesconfig.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: IndexController
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/14 15:55
 * @Version: 1.0
 */
@RestController
@RequestMapping("/configServer")
public class IndexController {

    private static Logger lg= LoggerFactory.getLogger(IndexController.class);

    @Value("${version}")
    private  String version="开发环境";

    @RequestMapping("/index")
    @ResponseBody
    public String gainConfig(){
        lg.info("=============<<<<<<<<<"+"当前环境："+version+">>>>>>>>>===========");
        return "当前环境："+version;
    }
}
