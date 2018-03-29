package com.search.dubbo.service;


import com.search.dubbo.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User getById(String id);
    void test();
}
