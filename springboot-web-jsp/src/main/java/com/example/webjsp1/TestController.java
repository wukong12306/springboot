package com.example.webjsp1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/get")
    public String get(HttpServletRequest request){

        ArrayList<String> strings = new ArrayList<>();
        strings.add("测试数据1");
        strings.add("测试数据2");
        strings.add("测试数据3");
        request.setAttribute("list",strings);
        return "index";
    }
}
