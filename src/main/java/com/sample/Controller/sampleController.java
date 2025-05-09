package com.sample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class sampleController {

    @GetMapping
    public String getMessage(){
        return "hello Docker!this is sample message";
    }
}
