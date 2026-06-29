package com.example.apm_demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Component
public class TrafficGenerator {

    private final RestTemplate restTemplate = new RestTemplate();
    private final Random random = new Random();

    private final List<String> urls = List.of(
            "http://localhost:8080/",
            "http://localhost:8080/login",
            "http://localhost:8080/register",
            "http://localhost:8080/profile",
            "http://localhost:8080/dashboard",
            "http://localhost:8080/products",
            "http://localhost:8080/orders",
            "http://localhost:8080/payment",
            "http://localhost:8080/search",
            "http://localhost:8080/report",
            "http://localhost:8080/slow",
            "http://localhost:8080/cpu",
            "http://localhost:8080/random",
            "http://localhost:8080/error"
    );

    @Scheduled(fixedRate = 1000)
    public void generateTraffic() {
        String url = urls.get(random.nextInt(urls.size()));

        try {
            restTemplate.getForObject(url, String.class);
            System.out.println("Hit: " + url);
        } catch (Exception e) {
            System.out.println("Error hit: " + url);
        }
    }
}