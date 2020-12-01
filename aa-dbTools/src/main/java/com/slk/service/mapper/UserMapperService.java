package com.slk.service.mapper;

import com.slk.components.serviceAPI.AbstractUserService;
import com.slk.dao.mapper.UserMapper;
import com.slk.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
@Service
public class UserMapperService extends AbstractUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(Integer id) {
		return userMapper.findById(id);
	}
}
