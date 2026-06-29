package com.example.apm_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApmDemoApplication.class, args);
    }
}