package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service //spring MVC のサービスクラスであることを表す。DI (Dependency Injection) の対象となる
@Transactional //トランザクション制御を行うためのアノテーション
public class UserService {

    /**
     * ユーザー情報 Repository
     */
    @Autowired //spring MVC のサービスクラスであることを表す。DI (Dependency Injection) の対象となる
    UserRepository userRepository;

    public List<User> searchAll() {
        // ユーザーTBLの内容を全検索
        return userRepository.findAll();
    }
    
    public List<User> serchNameUsers(String name){
    	return userRepository.findByName(name);
    }
    
    public List<User>serchId(int id) {
    	
    	return userRepository.findById(id);
		
	}
    public User createUser(User user) {

    	return userRepository.save(user);
    }
    public User updateUser(User user) {
    	user.setName("update_test1");
        return userRepository.save(user);
    }
    public void deleteUsers(int id) {
        userRepository.deleteById(id);
    }
    
}