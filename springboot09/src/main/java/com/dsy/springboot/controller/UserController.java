package com.dsy.springboot.controller;

import com.dsy.springboot.dao.UserDao;
import com.dsy.springboot.popj.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author trueway
 */
@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        User user = userDao.findById(id).orElse(null);
        return user;
    }

    /**
     * 新增用户信息
     *
     * @param user
     * @return
     */
    @GetMapping("/user")
    public User insertUser(User user) {
        User save = userDao.save(user);
        return save;

    }

}
