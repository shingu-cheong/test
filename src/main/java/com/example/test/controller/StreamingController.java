package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StreamingController {
    @GetMapping("/hello/{deviceid}")
    public String home(@PathVariable int deviceid){
        return "videolive";
    }
}
