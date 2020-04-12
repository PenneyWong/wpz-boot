package com.wpz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wpz.pojo.Pig;

@SpringBootTest
class BlogApplicationTests {

	@Autowired
	private Pig pig;

	@Test
	void contextLoads() {

		System.out.println(pig);
	}

}
