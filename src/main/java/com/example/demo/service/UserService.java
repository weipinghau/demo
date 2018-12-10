package com.example.demo.service;

import com.example.demo.model.UserDomain;
import com.github.pagehelper.PageInfo;

public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
