package com.example.apm_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/login")
    public String login() {
        return "Login success";
    }

    @GetMapping("/slow")
    public String slow() throws InterruptedException {
        Thread.sleep(3000);
        return "Slow response";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Test error");
    }
}