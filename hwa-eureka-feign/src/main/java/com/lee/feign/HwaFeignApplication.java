package com.lee.feign;

import cn.hutool.core.net.NetUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients     //通过注解@EnableFeignClients配置Feign客户端功能
@RestController
@RefreshScope       //配置文件自动刷新
@EnableHystrix      //通过注解@EnableHystrix开启Hystrix
@EnableCircuitBreaker
public class HwaFeignApplication {
    public static void main(String[] args) {
        //判断 RabbitMQ 是否启动
        int rabbitMQPort=5672;
        if(NetUtil.isUsableLocalPort(rabbitMQPort)){
            System.err.printf("未在端口%d 发现 rabbitMQ服务，请检查rabbitMQ 是否启动", rabbitMQPort);
            System.exit(1);
        }
        SpringApplication.run(HwaFeignApplication.class, args);
    }
    @Value("${hwa}")
    String hwa;
    @RequestMapping(value = "/hiConfigClient")
    public String hi(){
        return hwa;
    }
}
