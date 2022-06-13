package com.datpt.ecomerce_demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	
	@Column(name = "rolename")
	private String roleName;
	
	@OneToMany(mappedBy = "role")
	private List<User> users;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
}
