package com.example.eurekaserver3002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer3002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer3002Application.class, args);
    }

}
