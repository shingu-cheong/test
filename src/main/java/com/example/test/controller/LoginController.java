package com.example.test.controller;


import com.example.test.model.Login;
import com.example.test.model.User;
import com.example.test.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping("/user/check")
    public ResponseEntity<Optional<User>> checkUser(@RequestBody Login login) throws Exception {

        Optional<User> user = userService.checkUser(login.getUserEmail(), login.getUserPassword());
        if(user.isPresent()){
            return new ResponseEntity("로그인 성공", HttpStatus.OK);
        }else{
            return new ResponseEntity("존재하지 않는 아이디 또는 비번", HttpStatus.NOT_FOUND);
        }
    }
}
