package com.wpz.pojo;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true, encoding = "UTF-8") // 导入配置问价
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
		String name = null;
		String sex = null;
		try {
			name = new String(this.name.getBytes("ISO-8859-1"), "UTF-8");
			sex = new String(this.sex.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Pig [name=" + name + ", sex=" + sex + "]";
	}
}
