package com.dsy.springboot.dao;

import com.dsy.springboot.popj.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author trueway
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
