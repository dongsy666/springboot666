package com.dsy.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsy.springboot.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author trueway
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
