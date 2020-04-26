package com.cloud.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface FeignService {
    @RequestMapping("/hello")
    String hello();
}
