package com.wpz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Start {

	@RequestMapping("/hello")
	public String start() {
		return "Hello World";
	}
}