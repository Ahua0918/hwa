package com.lee.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class HwaZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(HwaZullApplication.class,args);
    }
}
