package com.lee.feign.controller;


import com.lee.feign.client.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeignController {

    @Autowired
    HelloFeignClient helloFeignClient;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return helloFeignClient.sayHiFromFeign(name);
    }
}
