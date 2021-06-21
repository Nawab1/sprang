package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String userName;
 private String firstName;
 private String lastName;
 private String email;
 private String password;
 private String imagePath;
 private boolean enabled = true;
 @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
 @JoinTable(name = "user_role",joinColumns =@JoinColumn(name = "user_id"),
         inverseJoinColumns = @JoinColumn(name="role_id")
		 )

 private List<Role> roles = new ArrayList<Role>();
}
