package com.cloud.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private HelloService helloService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public  String helloConsumer(){
        HelloSerivceCommand  command = new HelloSerivceCommand("hello",restTemplate);
        String result=command.execute();
        return  result;
    }
}
