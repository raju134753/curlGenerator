package com.curlGenerator;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @PostMapping("/submit")
    public String submitForm(@RequestBody String requestData) {
        // Extract data from request

        // Process the data and create a plain text response
        return requestData;
    }
}

