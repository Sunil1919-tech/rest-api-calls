package com.bridgelabz.restapispringapp.controller;

import com.bridgelabz.restapispringapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestApiController {

    /**
     * purpose: to perform http method to get the value from specified resource.
     *
     * @return displays the message from specified resource
     */
    @GetMapping(value = "/message")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    /**
     * purpose: to perform http method and appending the parameters using requestParam
     *
     * @param Mark: String value which is passing through requestParam
     * @return display the message
     */
    @GetMapping(value = "/query")
    public String sayHelloMark(
            @RequestParam(value = "name") String Mark
    ) {
        return "Hello" + Mark + " " + "from Bridgelabz";
    }

    /**
     * purpose: to perform http method using pathVariable
     *
     * @param name: string value which appended to the path
     * @return: display the message
     */
    @GetMapping(value = "/path/{name}")
    public String sayHello(
            @PathVariable String name
    ) {
        return "Hello " + name + " from BridgeLabz";
    }

    /**
     * purpose: to perform http method PUT and used requestBody to the user details
     *
     * @param userDTO: class which has the user details and that we are calling into the method
     * @return: userDetails
     */
    @PostMapping(value = "/postBody")
    public UserDTO userDetails(
            @RequestBody UserDTO userDTO
    ) {
        return userDTO;
    }

    /**
     * purpose: to perform http method and pathVariable and requestParam operations
     *
     * @param firstName: string value assigning to the URL path
     * @param Taylor:    String value appended using requestParam
     * @return: display the message from specified resources
     */
    @PutMapping(value = "/put/{firstName}")
    public String sayHello(
            @PathVariable String firstName,
            @RequestParam(value = "lastName") String Taylor
    ) {
        return "Hello " + firstName + " " + Taylor + " from BridgeLabz";
    }
}
