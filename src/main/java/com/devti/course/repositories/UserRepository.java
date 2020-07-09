package com.devti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devti.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
}
