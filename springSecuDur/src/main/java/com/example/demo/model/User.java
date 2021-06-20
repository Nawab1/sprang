package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User {
 private Long id;
 private String userName;
 private String firstName;
 private String lastName;
 private String password;
 private String imagePath;
 private boolean enabled;
 @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
 @JoinTable(name = "user_role",joinColumns =@JoinColumn(name = "user_id"),
         inverseJoinColumns = @JoinColumn(name="role_id")
		 )
 private List<Role> roles = new ArrayList<Role>();
}
