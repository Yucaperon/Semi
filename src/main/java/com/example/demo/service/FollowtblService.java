package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Followtbl;
import com.example.demo.repository.FollowtblRepository;

//User_tblのService宣言
@Service
public class FollowtblService {

//User_tblのRpository呼び出しとUtblRepoでの実装
    @Autowired
    FollowtblRepository FollowRepo;
    
    // ユーザーTBLの内容を全検索
    public List<Followtbl> searchAll() {
        return FollowRepo.findAll();
    }
    
}