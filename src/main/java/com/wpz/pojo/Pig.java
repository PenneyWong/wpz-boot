package com.wpz.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true, encoding = "UTF-8") //导入配置问价
@ConfigurationProperties(prefix = "pig")
@Validated
public class Pig {

//	@Value("${pig.name}")
	private String name;
//	@Value("${pig.sex}")
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + ", sex=" + sex + "]";
	}
}
