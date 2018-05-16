package com.zeroleung.mapper;

import org.apache.ibatis.annotations.Param;

import com.zeroleung.domain.User;

public interface UserMapper {
	
	User doLogin(@Param("userName")String userName,@Param("password")String password);
}
