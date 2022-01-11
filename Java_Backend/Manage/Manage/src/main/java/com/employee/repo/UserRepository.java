package com.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
