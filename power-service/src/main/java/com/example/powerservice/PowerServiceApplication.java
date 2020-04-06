package com.example.powerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.example")
public class PowerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PowerServiceApplication.class, args);
    }

}
