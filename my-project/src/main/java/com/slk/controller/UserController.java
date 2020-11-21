package com.slk.controller;

import com.slk.domain.User;
import com.slk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public User find(){
		return userService.findOne();
	}

}
