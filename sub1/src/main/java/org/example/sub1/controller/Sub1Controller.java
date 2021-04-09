package org.example.sub1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sub1Controller {

    @GetMapping("/sub1/hello")
    public String hello() {
        return "sub1";
    }

}
