package com.springboot.app.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootAppEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAppEurekaServer.class, args);
    }

}
