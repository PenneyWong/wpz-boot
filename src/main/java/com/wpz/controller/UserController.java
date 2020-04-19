package com.wpz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpz.pojo.User;
import com.wpz.result.R;
import com.wpz.service.UserDaoImpl;

@RestController
public class UserController {

	@Autowired
	private UserDaoImpl userDaoImpl;

	@RequestMapping("/selectById")
	public String selectById() {

		return userDaoImpl.selectById("2").toString();
	}
	
	@RequestMapping("/selectUserList")
	public R selectUserList() {
		List<User> list = userDaoImpl.selectUserList();
		return R.ok().data("items",list).message("测试列表");
	}
}
