package com.wpz.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@ImportResource("classpath = application.properties") // 导入多个配置文件
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class WpzBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpzBootApplication.class, args);

		System.out.println("Status: Started");
	}
}
