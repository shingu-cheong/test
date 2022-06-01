package com.example.test.repository;

import com.example.test.model.UserElder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserElderRepository extends JpaRepository<UserElder, Integer> {

}