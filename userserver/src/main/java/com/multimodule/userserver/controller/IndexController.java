package com.multimodule.userserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ClassName: IndexController
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/20 9:50
 * @Version: 1.0
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/one")
    public String index(Map<String, Object> model)  {
        return "index";
    }
}
