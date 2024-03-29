package com.soft.domainservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.soft")
public class DomainServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomainServiceApplication.class, args);
    }
}
