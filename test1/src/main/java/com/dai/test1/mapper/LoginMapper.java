package com.dai.test1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dai.test1.model.User;

@Mapper
public interface LoginMapper {

    public List<User> Loginuser(@Param("usernumber") String usernumber,@Param("userpassword") String userpassword);


}
