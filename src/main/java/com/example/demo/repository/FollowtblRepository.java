package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Followtbl;

//User_tblのRepository宣言
@Repository
public interface FollowtblRepository extends JpaRepository<Followtbl, String> {
	
}