package com.cloud.training.springhelloworldcf.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
 
    @RequestMapping("/hello")
    String getMessage(@RequestParam(value = "name") String name) {
        String rsp = "Hi " + name + " : responded on - " + new Date();
        System.out.println(rsp);
        return rsp;
    }
}
