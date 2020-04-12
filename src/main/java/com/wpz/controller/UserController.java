package com.wpz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpz.service.UserDaoImpl;

@RestController
public class UserController {

	@Autowired
	private UserDaoImpl userDaoImpl;

	@RequestMapping("/selectById")
	public String selectById() {

		return userDaoImpl.selectById("2").toString();
	}
}
