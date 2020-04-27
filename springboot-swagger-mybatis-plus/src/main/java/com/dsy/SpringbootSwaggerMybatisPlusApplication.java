package com.dsy;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author trueway
 */
@SpringBootApplication
@MapperScan("com.dsy.mapper")
@EnableSwagger2Doc
public class SpringbootSwaggerMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwaggerMybatisPlusApplication.class, args);
    }

}
