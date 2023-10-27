package com.Avananta.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.Avananta.entity.YourEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface YourEntityRepository extends JpaRepository<YourEntity, Long> {
    
    @Query("SELECT e FROM YourEntity e WHERE e.yourColumn = :yourParameter")
    YourEntity findRecordByYourColumn(@Param("yourParameter") String yourParameter);
//    @Query("SELECT * FROM YourEntity e WHERE e.yourColumn = :yourParameter")
//    YourEntity findRecordByYourColumn1(@Param("yourParameter") String yourParameter);
//  
}
