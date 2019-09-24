package com.lee.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer     //通过注解@EnableConfigServer开启配置服务器功能
@EnableDiscoveryClient
public class HwaConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HwaConfigServerApplication.class, args);
    }
}
