package com.employee.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.employe.dto.UserRegistrationDto;
import com.employee.entity.User;

public interface UserService extends UserDetailsService{
	User save(User user);

	User UsertById(long id);

	List<User> findAllUsers();

	Boolean deleteUserById(long id);

	void updateUser(User user);
}
