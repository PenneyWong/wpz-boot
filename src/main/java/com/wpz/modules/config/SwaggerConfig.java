package com.wpz.modules.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.wpz.modules.pojo.SwaggerBean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2
@Configuration
@ComponentScan("com.wpz.modules.controller")
public class SwaggerConfig {

	@Autowired
	private SwaggerBean swaggerBean = new SwaggerBean();

	@Bean
	public Docket creatSwagger() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfoBuilder().title(swaggerBean.getTitle())
				.version(swaggerBean.getVersion()).description(swaggerBean.getDescription()).build());
	}

//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title(swaggerBean.getTitle()).version(swaggerBean.getVersion())
//				.description(swaggerBean.getDescription()).build();
//	}
}