package com.zeroleung.service;



import com.zeroleung.domain.User;

public interface UserService {
	User doLogin(String userName,String password);

}
