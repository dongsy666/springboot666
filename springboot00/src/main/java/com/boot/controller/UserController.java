package com.boot.controller;

import com.boot.pojo.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/userList")
    public List<User> userList(){
        List<User> users=userService.getUserList();
        System.out.println(users.size());
        return users;
    }
}
