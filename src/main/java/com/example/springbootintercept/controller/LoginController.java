package com.example.springbootintercept.controller;

import com.example.springbootintercept.intercept.RepeatSubmit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
//标注了@RepeatSubmit注解，全部的接口都需要拦截
@RepeatSubmit
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login success";
    }
}
