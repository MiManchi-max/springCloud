package com.feign.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

    @GetMapping(path = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
