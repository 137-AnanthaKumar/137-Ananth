package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.User;
import com.employee.service.UserService;



@RestController
@RequestMapping(path="user")
public class UserController {
  
	@Autowired
	public UserService userservice;
	@PostMapping("/")
	public ResponseEntity<Void> saveUser(@RequestBody User user)
	{
		userservice.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).header("creation statuss", "created").build();
	}
	@GetMapping("/{id}")
	public ResponseEntity<User> getDepartmentById(@PathVariable long id) {

		User  usr=userservice.UsertById(id);
		return ResponseEntity.ok(usr);
	} 
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUserlist(){
		List<User> dept=userservice.findAllUsers();
		return ResponseEntity.ok(dept);
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable long id){
	{
		String body="Record deleted succesfully";
		
		Boolean delStatus=userservice.deleteUserById(id);
		if(!delStatus) {
			body="could not delete the record";
		}
	return ResponseEntity.ok().body(body);
		}
	}
	@PutMapping("/")
	public ResponseEntity<String> updateuser(@RequestBody User user){
		String strUpdateStatus="data updated successfully";
		userservice.updateUser(user);
		return ResponseEntity.ok().body("ok");
	}
	
}
