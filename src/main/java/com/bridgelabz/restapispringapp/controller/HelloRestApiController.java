package com.bridgelabz.restapispringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApiController {

    @GetMapping(value = "/message")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping(value = "/query")
    public String sayHelloMark(
            @RequestParam(value = "name") String Mark
    ) {
        return "Hello" + Mark + " " + "from bridgelabz";
    }

    @GetMapping(value = "/path{name}")
    public String sayHello(
            @PathVariable String name
    ) {
        return "Hello " + name + " from BridgeLabz";
    }
}
