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
@RequestMapping("/login")
public class UserLogin {

    @Resource
    private UserService userService;

    /**
     * 登入功能controller层
     * @param values
     * @return
     */
    @PostMapping("/loginuser")
    public List<User> GetuserController(@RequestBody String values){
        User user = JSON.parseObject(values, User.class);
        System.out.println(user);
        return userService.getuser(user);
    }

}
