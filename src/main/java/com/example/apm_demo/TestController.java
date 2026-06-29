package com.example.apm_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {

    private final Random random = new Random();

    @GetMapping("/")
    public String home() {
        return "APM Demo Running";
    }

    @GetMapping("/login")
    public String login() {
        return "Login Successful";
    }

    @GetMapping("/register")
    public String register() {
        return "Registration Successful";
    }

    @GetMapping("/profile")
    public String profile() {
        return "User Profile";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Dashboard Loaded";
    }

    @GetMapping("/products")
    public String products() {
        return "Products Loaded";
    }

    @GetMapping("/orders")
    public String orders() {
        return "Orders Loaded";
    }

    @GetMapping("/payment")
    public String payment() throws Exception {
        Thread.sleep(500);
        return "Payment Completed";
    }

    @GetMapping("/search")
    public String search() throws Exception {
        Thread.sleep(200 + random.nextInt(800));
        return "Search Results";
    }

    @GetMapping("/report")
    public String report() throws Exception {
        Thread.sleep(1500);
        return "Report Generated";
    }

    @GetMapping("/slow")
    public String slow() throws Exception {
        Thread.sleep(3000);
        return "Slow Response";
    }

    @GetMapping("/cpu")
    public String cpu() {

        long sum = 0;

        for (int i = 0; i < 20_000_000; i++) {
            sum += i;
        }

        return "CPU Task Finished " + sum;
    }

    @GetMapping("/random")
    public String randomEndpoint() throws Exception {

        int n = random.nextInt(100);

        if (n < 15) {
            throw new RuntimeException("Random Failure");
        }

        Thread.sleep(random.nextInt(2000));

        return "Random Request";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Payment Service Failed");
    }
}