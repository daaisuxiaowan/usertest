package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.model.User;
@Mapper
public interface IUserDao {
	public User queryUser(@Param("id") Integer id);
    public void addUser(User user);
}
