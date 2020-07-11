package com.devti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devti.course.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
	