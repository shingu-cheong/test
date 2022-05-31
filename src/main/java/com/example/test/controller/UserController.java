package com.example.test.controller;

import com.example.test.model.User;
import com.example.test.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @GetMapping("/users/{email}/{password}")
    public Map findUserbyEmail(@PathVariable String email, String password) throws Exception {
        Optional<User> user1 = userService.checkUser(email, password);
        if(user1.isPresent()){
            Map<String, String> response = new HashMap<>();
            response.put("user_id", user1.get().getId().toString());
            return  response;
        }else{
            throw new Exception("존재하지 않음");
        }
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
