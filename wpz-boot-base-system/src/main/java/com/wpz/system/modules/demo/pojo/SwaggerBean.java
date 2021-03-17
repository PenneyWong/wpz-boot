package com.wpz.system.modules.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:application.yaml", ignoreResourceNotFound = true, encoding = "UTF-8")
@ConfigurationProperties(prefix = "swagger")
public class SwaggerBean {

	private String title;
	private String version;
	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "SwaggerBean [title=" + title + ", version=" + version + ", description=" + description + "]";
	}

}
