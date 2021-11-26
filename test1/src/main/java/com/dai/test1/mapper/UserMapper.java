package com.dai.test1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dai.test1.model.User;

@Mapper
public interface UserMapper {

    public void insertuser(User user);

    public void update(User user);

    public void deleteUser(String userid);

    public List<User> getUserinfo(String userid);
}
