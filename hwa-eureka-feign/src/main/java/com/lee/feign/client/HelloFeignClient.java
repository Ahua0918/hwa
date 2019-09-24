package com.lee.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hwa-eureka-client",fallback = HelloFeignClientHystrix.class)
public interface HelloFeignClient {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromFeign(@RequestParam(value = "name") String name);
}
