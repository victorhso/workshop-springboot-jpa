package com.devti.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devti.course.entities.Products;
import com.devti.course.repositories.ProductRepository;

@Service //Registra a classe como componente do Spring
public class ProductService {

	@Autowired //Para que o spring faça a injenção de dependência
	private ProductRepository repository;
	
	public List<Products> findAll(){
		return repository.findAll();
	}
	
	public Products findById(Long id) {
		Optional<Products> obj = repository.findById(id);
		return obj.get();
	}
}

