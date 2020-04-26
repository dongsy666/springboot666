package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//这个包下的所有请求都不会走视图,相当于@Controller+方法上的@ResponseBody
public class TestController {
    @RequestMapping("test")
    public String test(){
        return "ok";
    }

}

