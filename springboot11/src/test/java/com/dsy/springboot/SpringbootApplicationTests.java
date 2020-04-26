package com.dsy.springboot;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dsy.springboot.mapper.UserMapper;
import com.dsy.springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
    /**
     * mp实现分页
     */
    @Test
    public void testPage() {

        // 创建page对象，传递两个参数：当前页和每页记录数
        Page<User> page = new Page<>(1, 3);
        // 分页查询
        userMapper.selectPage(page, null);
        // 通过page对象获取分页数据
        List<User> records = page.getRecords(); // 每页数据
        long current = page.getCurrent(); // 当前页
        long pages = page.getPages();// 总页数
        long total = page.getTotal();// 总记录数
        long size = page.getSize();// 每页记录数
        boolean previous = page.hasPrevious();// 是否有上一页
        boolean next = page.hasNext();// 是否有下一页

        System.out.println(records);
        System.out.println(current);
        System.out.println(pages);
        System.out.println(total);
        System.out.println(size);
        System.out.println(previous);
        System.out.println(next);
    }


}
