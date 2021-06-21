package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HttpRepo;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class HomeController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/")
	public ResponseEntity<HttpRepo> createUser(@RequestBody User user){
		
		Role r = new Role();
		r.setRoles("ROLE_USER");
		user.getRoles().add(r);
	    user =userService.createUser(user);
	    return new ResponseEntity<HttpRepo>(new HttpRepo(user.getUserName()),
	    		HttpStatus.OK);
		
		
	}
	@GetMapping("/get/{username}")
	public ResponseEntity<HttpRepo> getUser(@PathVariable String username){
		User u =  userService.getUser(username);
		
		return new ResponseEntity<HttpRepo>(new HttpRepo(u), HttpStatus.OK);
	}
	
	@DeleteMapping("/get/{username}")
	public ResponseEntity<HttpRepo> delUser(@PathVariable String username){
         userService.delUser(username);
		
		return new ResponseEntity<HttpRepo>(new HttpRepo("nice"), HttpStatus.OK);
	}
}
