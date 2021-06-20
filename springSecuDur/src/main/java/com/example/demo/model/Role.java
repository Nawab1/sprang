package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
    private String roles;
    @ManyToMany(mappedBy = "roles")
    private List<User> usr = new ArrayList<User>();
}
