package com.employee.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	UserEntity findUserById(long id);

}
