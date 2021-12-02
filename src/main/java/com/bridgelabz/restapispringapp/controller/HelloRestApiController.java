package com.bridgelabz.restapispringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApiController {

    @GetMapping(value = "/message")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
