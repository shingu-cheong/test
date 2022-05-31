package com.example.test.repository;

import com.example.test.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

//    @Transactional
//    @Modifying
//    @Query(value = "INSERT INTO users(user_name, user_email, user_password, user_ph, user_img) VALUES (:user_name, :user_email, :user_password, :user_ph, :user_img)", nativeQuery = true)
//    int registerNewUser(@Param("user_name") String userName,
//                        @Param("user_email") String userEmail,
//                        @Param("user_password") String userPassword,
//                        @Param("user_ph") String userPh,
//                        @Param("user_img") String userImg);
//    @Query(value = "SELECT user_password, user_email FROM users WHERE user_email = ?")
    Optional<User> findByUserEmailAndUserPassword(String userEmail, String userPassword);





}
