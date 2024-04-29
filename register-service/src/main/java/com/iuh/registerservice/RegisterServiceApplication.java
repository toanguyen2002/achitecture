package com.iuh.registerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RegisterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterServiceApplication.class, args);
    }

}
