package com.gs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/7.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
