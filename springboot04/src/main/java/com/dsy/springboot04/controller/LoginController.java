package com.dsy.springboot04.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dsy
 */
@Controller
public class LoginController {
    @RequestMapping("/login.html")
    public  String Login(){
        return "login";
    }

}
