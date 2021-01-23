package com.wpz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource("classpath = application.properties") // 导入多个配置文件
@SpringBootApplication
public class WpzBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpzBootApplication.class, args);

		System.out.println("Status: Started");
	}

}
