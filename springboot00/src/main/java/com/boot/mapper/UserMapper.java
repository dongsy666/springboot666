package com.boot.mapper;

import com.boot.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper//表明这是一个mybatis的mapper,另一种全局的写法是在主程序中添加
@MapperScan("com.boot.mapper")
@Repository//交给spring管理
public interface UserMapper {
    //查询所有user
    List<User> getUserList();
}
