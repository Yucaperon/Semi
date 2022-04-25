package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ユーザー情報 Controller
 */
@Controller
public class Usercontroller {
	
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	UserService userService;
	
	/**
	 * ユーザー情報一覧画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)	
	public String displayList(Model model) {

		List<User> usernamesList = userService.serchNameUsers("test1");//name検索
		for (User user : usernamesList) {
			System.out.println("UNName : "+user);
		}
		
		List<User> userIdList = userService.serchId(1290520);//id検索
		for (User user : userIdList) {
			System.out.println("UNID : "+user);
		}
		
		User tmpUser = new User();
		tmpUser.setId(1290510);
		tmpUser.setName("test01");
		tmpUser.setAddress("aaa@bbb");
		tmpUser.setPhone("080-9999-8888");
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date;
		try {
			date = sdFormat.parse("2019/05/06 12:00:00");
			tmpUser.setUpdateDate(date);
			tmpUser.setCreateDate(date);
			tmpUser.setDeleteDate(null);
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		System.out.println("CreateDB : "+userService.createUser(tmpUser));//データ制作
		
		//userService.deleteUsers(1290557);//消去

		 userService.updateUser(tmpUser);
		 
		
		List<User> userlist = userService.searchAll();
		model.addAttribute("userlist", userlist);
	  	return "list";
	}
}