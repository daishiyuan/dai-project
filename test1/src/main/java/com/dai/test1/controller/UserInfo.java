package com.dai.test1.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.dai.test1.model.User;
import com.dai.test1.service.UserService;

@RestController
@RequestMapping("/userinfo")
public class UserInfo {
    @Resource
    private UserService userService;



    @PostMapping("/selectuserinfo")
    public List<User> InsertUserinfo(@RequestBody String values){
        User user = JSON.parseObject(values, User.class);
        System.out.println(user);
        return userService.getuserinfo(user);
    }
}
