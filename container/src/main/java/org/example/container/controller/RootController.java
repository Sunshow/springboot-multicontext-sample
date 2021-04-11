package org.example.container.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/root/hello")
    public String hello() {
        return "root";
    }

}
