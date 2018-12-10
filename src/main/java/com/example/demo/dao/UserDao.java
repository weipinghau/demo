package com.example.demo.dao;

import com.example.demo.model.UserDomain;

import java.util.List;

public interface UserDao {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}
