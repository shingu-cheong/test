package com.example.test.repository;

import com.example.test.model.Elder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElderRepository extends JpaRepository<Elder, Integer> {
}