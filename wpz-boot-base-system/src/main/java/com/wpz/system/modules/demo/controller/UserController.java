package com.wpz.system.modules.demo.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wpz.system.modules.demo.service.UserDaoImpl;

@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserDaoImpl userDaoImpl;

	@RequestMapping(value = "/selectById", method = RequestMethod.GET, produces = "application/json;charset:Utf-8")
	public String selectById() {

		return userDaoImpl.selectById("2").toString();
	}

	@RequestMapping(value = "/selectUserList", method = RequestMethod.GET, produces = "application/json;charset:Utf-8")
	public List<Map> selectUserList() {
		return userDaoImpl.selectUserList();
	}
}
