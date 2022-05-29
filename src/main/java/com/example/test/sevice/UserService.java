package com.example.test.sevice;

import com.example.test.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();

    User saveUser(User user);

    User getSingleUser(int id);

    void deleteUser(int id);

    User updateUser(User user);

    Optional<User> checkUser(String userEmail, String userPassword) throws Exception;
}
