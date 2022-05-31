package com.example.test.repository;

import com.example.test.model.Elder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ElderRepository extends JpaRepository<Elder, Integer> {
    @Query(value = "select elders.* from elders  INNER join (select elder_num from groupmembers g where g.user_num = '1') as b  on (elders.elder_num = b.elder_num)", nativeQuery = true)
    List<Elder> findByUserId(int usernum);
}