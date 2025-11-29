package com.sprinboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@GetMapping("/save")
	public String save() {
		jdbcTemplate.update("insert into marks values(?,?,?,?)", 103,"Sai",65000,"Senior Software Engineer");
		return "Saved";
	}

}
