package com.wpz.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wpz.pojo.User;

@Mapper
public interface UserDao {

	@Select("select * from user where id = #{id}")
	public User selectById(@Param("id") String id);

}