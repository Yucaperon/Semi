package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Followtbl;
import com.example.demo.entity.Projecttbl;
import com.example.demo.entity.Usertbl;
import com.example.demo.service.FollowtblService;
import com.example.demo.service.ProjectService;
import com.example.demo.service.UsertblService;

//User_tblのController
@Controller
public class UsertblController {
	
//User_tblのServiceをUtblSer名でインスタンス
	@Autowired
	UsertblService UtblSer;
	@Autowired
	FollowtblService FollowSer;
	@Autowired
	ProjectService ProjectSer;
	
	/**
	 * ユーザー情報一覧画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@RequestMapping(value = "/usertbl/tst", method = RequestMethod.GET)	
	public String displayList(Model model) {
		
	  	List<Usertbl> usertbllist = UtblSer.searchAll();
	  	model.addAttribute("UtblSer", usertbllist);
	  	
	  	List<Followtbl> followtbllist = FollowSer.searchAll();
	  	model.addAttribute("FollowSer", followtbllist);
	  	
	  	List<Projecttbl> Projecttbllist = ProjectSer.searchAll();
	  	model.addAttribute("ProjectSer", Projecttbllist);
	  	
	  	return "usertbl/tst";
	}
	
}