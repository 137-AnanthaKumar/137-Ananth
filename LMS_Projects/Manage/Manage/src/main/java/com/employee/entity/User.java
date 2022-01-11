package com.employee.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
private Long id; 
private String UserId;
private String password;
@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

private Collection<Roles> roles;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUserId() {
	return UserId;
}
public void setUserId(String userId) {
	UserId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Collection<Roles> getRoles() {
	return roles;
}
public void setRoles(Collection<Roles> roles) {
	this.roles = roles;
}
public User(Long id, String userId, String password, Collection<Roles> roles) {
	super();
	this.id = id;
	UserId = userId;
	this.password = password;
	this.roles = roles;
}
}
