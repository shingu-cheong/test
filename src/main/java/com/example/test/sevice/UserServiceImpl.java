package com.example.test.sevice;

import com.example.test.model.User;
import com.example.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public  User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public  User getSingleUser(int id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        throw  new RuntimeException("유저를 찾을 수 없음");
    }

    @Override
    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user){
        return userRepository.save(user);
    }

    @Override
    public Optional<User> checkUser(String userEmail, String userPassword){
        return userRepository.findByUserEmailAndUserPassword(userEmail, userPassword);
//        if(user.isPresent()){
//            return new ResponseEntity("login successful", HttpStatus.OK);
//        }
//        throw  new RuntimeException("유저를 찾을 수 없음");

    }

//    @Override
//    public User getUserIdByEmail(String email, String userPassword){
//        return userRepository.findByUserEmailAndUserPassword(email,userPassword);
//    }

}
