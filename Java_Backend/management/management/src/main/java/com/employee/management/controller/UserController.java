package com.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.UserEntity;
import com.employee.management.service.UserService;


@RestController
@RequestMapping(path="/user")
public class UserController {
	@Autowired
	UserService userservice;
	@PostMapping("/")
     public ResponseEntity<Void>saveUser(@RequestBody UserEntity userentity) {
    	 userservice.saveUser(userentity);
    		return ResponseEntity.status(HttpStatus.CREATED).build();
     }
	
	@GetMapping("/")
	public ResponseEntity<List<UserEntity>>getAll(){
		List<UserEntity> userList= userservice.findAllUser();
		return ResponseEntity.ok(userList);
	}
	@PutMapping("/")
	public ResponseEntity<UserEntity> update(@RequestBody UserEntity userentity){
		UserEntity user=userservice.updateUser(userentity);
		return ResponseEntity.ok(user);
	}
	@GetMapping("/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable long id){
		UserEntity user=userservice.findUserById(id);
		return ResponseEntity.ok(user);
	}
	
}
