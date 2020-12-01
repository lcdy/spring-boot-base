package com.slk.controller;

import com.slk.components.exception.UserServiceException;
import com.slk.domain.User;
import com.slk.service.repository.UserRepositoryService;
import com.slk.service.mapper.UserMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepositoryService userRepositoryService;
	@Autowired
	private UserMapperService userMapperService;
	@Autowired
	private UserServiceException userServiceException;

	@GetMapping("/{id}")
	public User findById(@PathVariable("id")Integer id){
		if (id == 1) {
			throw userServiceException.setExceptionMessage("测试异常。。。");
		}
		System.out.println(userMapperService.findById(id));
		return userRepositoryService.findById(id);
	}

	@PostMapping("/user")
	public User create(@RequestBody User user){
		System.out.println(user);
		return user;
	}

	public void forTest(String string){
		System.out.println(string);
	}
}
