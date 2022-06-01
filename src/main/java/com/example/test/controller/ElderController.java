package com.example.test.controller;

import com.example.test.model.Elder;
import com.example.test.model.User;
import com.example.test.model.UserElder;
import com.example.test.repository.UserElderRepository;
import com.example.test.repository.UserRepository;
import com.example.test.sevice.ElderService;
import com.example.test.sevice.UserService;
import lombok.extern.java.Log;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/api/v1")
public class ElderController {

    @Autowired
    ElderService elderService;
    @Autowired
    UserService userService;

    @Autowired
    UserElderController userElderController;

    UserController userController;

    @GetMapping("/elders")
    public List<Elder> getElders(){
        return elderService.getElders();
    }

    @GetMapping("/{userid}/elders")
    public List<Elder> getUserElders(@PathVariable int userid){
        return elderService.getUserElders(userid);
    }

    @PostMapping("/{userid}/elders")
    public ResponseEntity<Elder> saveElder(@PathVariable int userid, @RequestBody Elder elder){
        User user = userService.getSingleUser(userid);
        UserElder userElder = new UserElder();
//        Integer elderid = elder.getId();
        Elder elder1 = elderService.saveElder(elder);
        userElder.setElder(elder1);
        userElder.setUser(user);

        userElderController.addUserElder(userElder);
//
//        userElderRepository.save(userElder);
//        user.setUserElders((List<UserElder>) userElder);
//        userService.updateUser(user);
//        elder.setUsers((List<UserElder>) userElder);
//

        return new ResponseEntity("fsdfa", HttpStatus.OK);
    }

}
