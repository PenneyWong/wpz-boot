package com.wpz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Start {

	@ResponseBody
	@RequestMapping("/hello")
	public String start () {
		
		return "Hello World";
	}
	
	@ResponseBody
	@RequestMapping("/user")
	public Map<String, Object> getMap() {

		Map<String, Object> user = new HashMap<String, Object>();

		user.put("姓名", "王彭真");
		user.put("年龄", "27");
		user.put("性别", "男");

		return user;
	}
}