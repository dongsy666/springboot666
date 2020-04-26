package com.dsy.springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @author dsy
 */
@Controller
public class HelloController {
    /**
     * 查出数据并展示在页面
     * @param map
     * @return
     */
    @RequestMapping("/success")
    public  String success(Map<String,Object> map){
        map.put("name","<h1>扬帆起航</h1>");
        map.put("employees", Arrays.asList("程序员","架构师","项目经理"));
        return "success";
    }
}
