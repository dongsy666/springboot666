package com.dsy.springboot06.controller;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author trueway
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user=request.getSession().getAttribute("loginUser");
        if (user==null){
            // 未登录，返回登录页面
            request.setAttribute("msg","没有权限,请重新登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
        }else {
            // 如果session里有user，表示该用户已经登陆，放行请求
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
