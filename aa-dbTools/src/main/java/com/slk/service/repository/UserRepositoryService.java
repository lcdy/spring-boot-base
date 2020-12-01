package com.slk.service.repository;

import com.slk.components.serviceAPI.AbstractUserService;
import com.slk.dao.repository.UserRepository;
import com.slk.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 快速生成测试代码：ctrl shift t
 */
@Service
public class UserRepositoryService extends AbstractUserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * 继承的简单查询方法
	 */
	public void fromExtendMethod(Integer id) {
		User user = new User(id, "xx", 10, "xx");

		// 必须进行结果校验
		Assert.isTrue(userRepository.findById(id).isPresent(), "findById");
		Assert.isTrue(userRepository.existsById(id), "existsById");
		// id不存在保存user，id存在更新user
		System.out.println(userRepository.save(user));
		userRepository.delete(user);

		List<User> users = userRepository.findAll();
		users.forEach(System.out::println);
	}


	/**
	 * Java Persistence Query Language: java规范了jpa的查询语言
	 */
	public void fromJPQL(){











	}

}
