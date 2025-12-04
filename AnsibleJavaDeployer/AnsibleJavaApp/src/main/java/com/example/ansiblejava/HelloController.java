package com.example.ansiblejava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Ansible Java App Running Successfully!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Ansible Java App!";
    }
}

