package com.cloud.demo.consumer;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

import org.springframework.web.client.RestTemplate;

public class HelloSerivceCommand extends HystrixCommand<String> {

    private RestTemplate restTemplate;

    protected HelloSerivceCommand(String commandGroupKey,RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey(commandGroupKey));
        this.restTemplate=restTemplate;
    }

    @Override
    protected String run() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return  restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

    @Override
    protected String getFallback() {
        return "error";
    }
}
