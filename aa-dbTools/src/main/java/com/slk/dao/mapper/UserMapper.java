package com.slk.dao.mapper;

import com.slk.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("select user.* from user where id = 1 limit 1")
	User findById(@Param("id") Integer id);
}
