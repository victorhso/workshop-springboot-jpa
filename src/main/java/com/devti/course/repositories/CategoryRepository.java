package com.devti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devti.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}
	