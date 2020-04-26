package com.dsy.springboot04.config;

import com.dsy.springboot04.controller.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author dsy
 */
@Configuration
public class MySpringMvcConfigure {

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
