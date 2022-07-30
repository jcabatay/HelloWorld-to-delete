package com.ascii274.greeting.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ( value = "/hellodocker/v2")
public class GreetingController2 {

    @GetMapping(value = "/greet/{name}")
    public ResponseEntity <String> greet(@PathVariable("name") String  name){
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }

    @GetMapping(value="/hello")
    @ResponseBody
    public String hello(){
        return "Hello, docker";
    }
}
