package com.wpz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpz.dao.UserDao;
import com.wpz.pojo.User;

@Service
public class UserDaoImpl {
	
	@Autowired
	private UserDao userDao;
	
	public User selectById(String id) {
		return userDao.selectById(id);
	}
}