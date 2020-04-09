package com.wpz.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wpz.pojo.User;

import io.lettuce.core.dynamic.annotation.Param;

@Mapper
public interface UserDao {

	@Select("select * from user where id = #{id}")
	public User selectById(@Param("id") String id);

}