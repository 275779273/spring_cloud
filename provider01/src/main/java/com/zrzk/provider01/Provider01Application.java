package com.zrzk.provider01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.zrzk.provider02.client")
public class Provider01Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider01Application.class, args);
    }

}
