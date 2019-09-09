package com.example.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.IUserDao;

@Controller
public class TestController {
	@Resource
	private IUserDao iud;
	@RequestMapping("/index")
	public String test(Model model,Integer id){
		System.out.println(id);
		model.addAttribute("user", iud.queryUser(id));
		model.addAttribute("hello", "成功");
		return "NewFile";
	}
}
