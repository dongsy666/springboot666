package com.cloud.demo.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    FeignService feignService;
    @RequestMapping("/consumer")
    public  String helloConsumer(){
        return feignService.hello();
    }

}
