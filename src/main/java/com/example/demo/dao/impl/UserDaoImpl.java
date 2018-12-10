package com.example.demo.dao.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.model.UserDomain;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public int insert(UserDomain record) {
        System.out.println("insert()---Dao");
        return 0;
    }

    @Override
    public List<UserDomain> selectUsers() {
        System.out.println("List<UserDomain> selectUsers()---Dao");
        return null;
    }
}
