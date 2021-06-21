package com.example.demo.service.simpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;
	public User createUser(User user) {
		Optional<User> u =   userRepository.findByUserName(user.getUserName());
		if(!u.isEmpty())
			throw new RuntimeException("already exist user ");
		else
		user=	userRepository.save(user);
		return  user;
	}
	@Override
	public User getUser(String username) {
	 User u1 ;
		Optional<User> u =  userRepository.findByUserName(username);
		if(u.isEmpty())
			throw new RuntimeException("user not exist with this name");
		else
			u1= u.get();
		return u1;
	}  
	
	public void delUser(String username) {
		userRepository.deleteByUserName(username);
	}
}
