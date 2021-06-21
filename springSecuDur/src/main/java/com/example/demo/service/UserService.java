package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
	public User createUser(User user) ;

	public User getUser(String username);

	public void delUser(String username);
}
