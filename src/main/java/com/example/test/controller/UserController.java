package com.example.test.controller;

import com.example.test.model.User;
import com.example.test.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/list")
//    public List<User>
    @GetMapping("/users")
    public List<User> getUsers(){
    return userService.getUsers();
}

    @GetMapping("/users/{id}")
    public User getUsers(@PathVariable int id){
        return userService.getSingleUser(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User user){
        user.setId(id);
        return userService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id,@RequestBody User user){
        user.setId(id);
        return userService.updateUser(user);
    }

}
