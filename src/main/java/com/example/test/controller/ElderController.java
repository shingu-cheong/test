package com.example.test.controller;

import com.example.test.model.Elder;
import com.example.test.model.User;
import com.example.test.sevice.ElderService;
import com.example.test.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ElderController {

    @Autowired
    ElderService elderService;

    @GetMapping("/elders")
    public List<Elder> getElders(){
        return elderService.getElders();
    }

    @GetMapping("/{userid}/elders")
    public List<Elder> getUserElders(@PathVariable int userid){
        return elderService.getUserElders(userid);
    }

    @PostMapping("/elders")
    public ResponseEntity<Elder> saveElder(@RequestBody Elder elder){
        Elder elder1 = elderService.saveElder(elder);
        return new ResponseEntity(elder1, HttpStatus.OK);
    }

}
