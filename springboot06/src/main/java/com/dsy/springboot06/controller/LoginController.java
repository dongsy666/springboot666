package com.dsy.springboot06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.Map;

/**
 * @author trueway
 */
@Controller
public class LoginController {
    @PostMapping(value = "/user/login")
    public String login(@PathParam("username") String username, @PathParam("password") String password, Map<String,Object> map, HttpSession session){
        // 判断用户是否登录成功
        if (!StringUtils.isEmpty(username)&&"123456".equals(password)){
            // 登录成功，跳转页面
            // 如果用户登录了，将信息存在session中
            session.setAttribute("loginUser",username);
            // 防止表单重复提交，可以重定向到主页
            return "redirect:/main.html";
        }else {
            // 登录失败,在登录页面显示错误提示
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }
}
