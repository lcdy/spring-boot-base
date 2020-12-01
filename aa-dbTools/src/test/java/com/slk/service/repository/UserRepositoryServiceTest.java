package com.slk.service.repository;

import com.slk.dao.repository.UserRepository;
import com.slk.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryServiceTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	void findById() {
		Optional<User> optional = userRepository.findById(10);
		Assert.assertTrue(optional.isPresent());
		System.out.println(optional.get());
	}

	// @Test
	void findOne() {
		//userRepository.findOne()
	}

	@Test
	void getOne() {
	}

	@Test
	void findAll() {
	}

	@Test
	void save() {
	}

	@Test
	void update() {
	}

	@Test
	void delete() {
	}



	@Test
	void count() {
	}

	@Test
	void exists() {
	}


}