package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;

@SpringBootApplication
public class SpringSecuDurApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuDurApplication.class, args);
	}

	@Autowired
	UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
	
	 
//		
//		User u = new User();
//		u.setEnabled(true);
//		u.setFirstName("nawab");
//		u.setImagePath("dp.png");
//		u.setLastName("ansari");
//		u.setPassword("nawab");
//		u.setUserName("nawab1");
//		Role r= new Role();
//		r.setRoles("ROLE_ADMIN");
//		Role r1 = new Role();
//		r1.setRoles("ROLE_USER");
//		u.getRoles().add(r);
//		u.getRoles().add(r1);
//		User u1 = userService.createUser(u);
//		System.out.println(u1.getUserName());
		
	}

}
