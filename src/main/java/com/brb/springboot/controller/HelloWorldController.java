package com.brb.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:8090")
public class HelloWorldController {

    @GetMapping(value = "hello")
    public String getHelloWorld() {
        return "Hello World!";
    }

}
