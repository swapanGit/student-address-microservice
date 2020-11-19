package com.codeswapan.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/addressServiceFallBackMethod")
    public String addressServiceFallBackMethod(){
        return "Address Service is down. Please try after sometime";
    }

    @GetMapping("/studentServiceFallBackMethod")
    public String studentServiceFallBackMethod(){
        return "Student Service is down. Please try after sometime";
    }
}
