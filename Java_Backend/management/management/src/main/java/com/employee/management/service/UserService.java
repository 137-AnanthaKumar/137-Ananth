package com.employee.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.employee.management.entity.UserEntity;
import com.employee.management.repo.UserRepository;


public class UserService {
	@Autowired
    UserRepository userrepo;
	public void saveUser(UserEntity userentity) {
		userrepo.save(userentity);
		
	}
	public List<UserEntity> findAllUser() {
		return userrepo.findAll(Sort.by(Sort.Direction.ASC,"name"));
	}
	public  updateUser(UserEntity userentity) {
		UserEntity userDB=userrepo.findUserById(userentity.getId());
		userDB.setUserName(userentity.getUserName());
		userDB.setPassword(userentity.getPassword());
		userrepo.save(userDB);
	}
	
	
	public UserEntity findUserById(long id) {
		
		return userrepo.findUserById(id);
	}
	
	
	
	
//	public UserEntity update(UserEntity userentity) {
//		UserEntity userent=userrepo.findUserById(userentity.getId());
//		userent.setName(user.getName());
//		userent.setAge(userentity.getAge());
//		userRepo.save(userent);
//		return userent;
//		
//	}

}
