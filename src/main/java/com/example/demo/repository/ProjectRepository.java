package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Projecttbl;

//User_tblのRepository宣言
@Repository
public interface ProjectRepository extends JpaRepository<Projecttbl, String> {
	
}