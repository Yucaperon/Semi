package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usertbl;
import com.example.demo.repository.UsertblRepository;

//User_tblのService宣言
@Service
public class UsertblService {

//User_tblのRpository呼び出しとUtblRepoでの実装
    @Autowired
    UsertblRepository UtblRepo;
    
    // ユーザーTBLの内容を全検索
    public List<Usertbl> searchAll() {
        return UtblRepo.findAll();
    }
    
}