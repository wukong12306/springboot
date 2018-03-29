package com.search.dubbo.mapper;

import com.search.dubbo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper {
    int insertUser(User user);
    User getUserById(String id);
}
