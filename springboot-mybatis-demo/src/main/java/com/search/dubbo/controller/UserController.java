package com.search.dubbo.controller;

import com.search.dubbo.pojo.User;
import com.search.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public User getById(HttpServletRequest request){
        String id = request.getParameter("id");
        if (id == null || id.equals("")){
            id = "1";
        }
        User byId = userService.getById(id);
        return byId;
    }
}
