package com.sprinbootjpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprinbootjpa.model.User;
import com.sprinbootjpa.srvice.UserPageService;
import com.sprinbootjpa.srvice.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserPageService pageService;
	
	@GetMapping("/save")
	public String saveUser() {
		String saveduser=userService.saveUser();
		return saveduser;
	}
	
	@GetMapping("/user")
	public int getUser() {
		User user= userService.getUserByName();
		return user.getAge();
	}
	
	@GetMapping("/bypage")
	public Page<User> getUserByPage(@RequestParam(name="page") int page, @RequestParam(name="size") int size){
		return pageService.getUserByPage(page, size);
	}
	

}
