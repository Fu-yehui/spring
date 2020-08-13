package com.roger.study.core.spring_web.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller   //声明为一个控制器
@RequestMapping( {"/","/homepage"})  //定义类级别的请求处理
public class HomeController {

    @RequestMapping(method=GET) //处理对"/"的GET请求
    public String home(){
        return "home";
    }
}
