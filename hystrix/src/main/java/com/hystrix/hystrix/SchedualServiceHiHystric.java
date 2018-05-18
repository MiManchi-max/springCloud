package com.hystrix.hystrix;

import com.hystrix.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return   "sorry "+name+"------------orry,error";
    }
}
