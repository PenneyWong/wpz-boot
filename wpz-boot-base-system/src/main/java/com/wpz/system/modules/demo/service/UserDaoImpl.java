package com.wpz.system.modules.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpz.system.modules.demo.dao.UserDao;
import com.wpz.system.modules.demo.pojo.User;

@Service
public class UserDaoImpl {
	
	@Autowired
	private UserDao userDao;
	
	public User selectById(String id) {
		return userDao.selectById(id);
	}
	
	public List<Map> selectUserList(){
		return userDao.selectUserList();
	}
}