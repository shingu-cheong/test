package com.example.test.controller;


import com.example.test.model.User;
import com.example.test.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RegisterController {
    @Autowired
    UserService userService;

//    @PostMapping("/register")
//    public ResponseEntity registerNewUser(@RequestParam("user_name") String userName,
//                                          @RequestParam("user_email") String userEmail,
//                                          @RequestParam("user_password") String userPassword,
//                                          @RequestParam("user_ph") String userPh,
//                                          @RequestParam("user_img") String userImg){
//
//        if(userName.isEmpty() || userEmail.isEmpty() || userPassword.isEmpty() || userPh.isEmpty()){
//            return new ResponseEntity<>("Please complete all Fields", HttpStatus.BAD_REQUEST);
//        }
////        String hashed_password = BCrypt.hashpw(userPassword, BCrypt.gensalt());
//
//
//        int result = userService.registerNewUserServiceMethod(userName, userEmail, userPassword,userPh,userImg);
//
//        if (result != 1){
//            return new ResponseEntity<>("Failed to Register User", HttpStatus.BAD_REQUEST);
//        }
//
//        return  new ResponseEntity<>("User Register Successfully", HttpStatus.OK);
//    }
//
//    @PostMapping("/register/2")
//    public List<User> add
////    @PostMapping("/register")
////    public  ResponseEntity
//    @GetMapping("/users")
//    public List<User> getUsers(){
//        return userService.getUsers();
//    }
//
//    @GetMapping("/users/{id}")
//    public String getUsers(@PathVariable int id){
//        return "Fetching the user details for the id" + id;
//    }
//
//    @PostMapping("/users")
//    public User saveUser(@RequestBody User user){
//        return userService.saveUser(user);
//    }
}
