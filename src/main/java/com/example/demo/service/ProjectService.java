package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Projecttbl;
import com.example.demo.repository.ProjectRepository;

//User_tblのService宣言
@Service
public class ProjectService {

//User_tblのRpository呼び出しとUtblRepoでの実装
    @Autowired
    ProjectRepository ProjctRepo;
    
    // ユーザーTBLの内容を全検索
    public List<Projecttbl> searchAll() {
        return ProjctRepo.findAll();
    }
    
}