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
    /**
     * 员工修改
     *
     * @param user
     * @return
     */
    @PutMapping("/user")
    public String updateUser(User user) {
        System.out.println("修改的员工数据：" + user);
        userDao.save(user);
        return "redirect:/users";
    }

    /**
     * 员工删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/user/{id}")
    public ModelAndView deleteUser(@PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView("redirect:/users");
        userDao.delete(id);

        return mv;
    }


}
