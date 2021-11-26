package com.dai.test1.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.dai.test1.controller.UserInfo;
import com.dai.test1.mapper.LoginMapper;
import com.dai.test1.mapper.UserMapper;
import com.dai.test1.model.User;

@Service
public class UserService {

    @Resource
    private LoginMapper loginMapper;

    @Resource
    private UserMapper userMapper;

    /**
     *
     * @param user
     * @return
     */
    public List<User> getuser(User user){
        String usernumber = user.getUser_number();
        String userpassword = user.getUser_password();
        return loginMapper.Loginuser(usernumber,userpassword);
    }

    public List<User> getuserinfo(User user){
        String userid = user.getUser_id();
        return userMapper.getUserinfo(userid);
    }


}
