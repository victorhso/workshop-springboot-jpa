package com.devti.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devti.course.entities.Category;
import com.devti.course.repositories.CategoryRepository;

@Service //Registra a classe como componente do Spring
public class CategoryService {

	@Autowired //Para que o spring faça a injenção de dependência
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}

