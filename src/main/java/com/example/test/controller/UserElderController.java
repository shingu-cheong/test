package com.example.test.controller;


import com.example.test.model.UserElder;
import com.example.test.sevice.ElderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserElderController {
    @Autowired
    ElderService elderService;

    @PostMapping("/user_elder")
    public UserElder addUserElder(@RequestBody UserElder userElder) {
        return elderService.addUserElder(userElder);
    }
}
