package com.ascii274.greeting.controller;

import com.ascii274.greeting.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ( value = "/hellodocker/v2")
public class GreetingController2 {

    private final GreetingService greetingService;

    @GetMapping(value = "/greet/{name}")
    public ResponseEntity <String> greet(@PathVariable("name") String  name){
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }

    @GetMapping(value="/hello")
    @ResponseBody
    public String hello(){
        return "Hello, docker";
    }

    /**
     * - Se usa en WebMockTest
     */
    public GreetingController2 (GreetingService service){
        this.greetingService = service;
    }

    @GetMapping("/hello-webmock")
    @ResponseBody
    public String helloWebmockTest(){
        return greetingService.hello();
    }
}
