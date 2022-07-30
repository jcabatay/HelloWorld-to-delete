package com.ascii274.greeting.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String hello(){
        return "Hello, docker";
    }
}
