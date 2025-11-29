package com.sprinboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	@RequestMapping("/bye")
	public String hi() {
		return "Hello World";
	}
}
