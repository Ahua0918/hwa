package com.lee.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //通过注解@EnableEurekaServer表示是个EurekaServer
public class HwaEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HwaEurekaApplication.class,args);
    }
}
