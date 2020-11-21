package com.slk.service;

import com.slk.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	public User findOne(){
		return new User("小菜", "女");
	}
}
