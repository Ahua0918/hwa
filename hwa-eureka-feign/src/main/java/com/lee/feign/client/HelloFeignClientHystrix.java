package com.lee.feign.client;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignClientHystrix implements HelloFeignClient {
    @Override
    public String sayHiFromFeign(String name) {
        return "sorry" +name;
    }
}
