package com.devti.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devti.course.entities.Order;
import com.devti.course.repositories.OrderRepository;

@Service //Registra a classe como componente do Spring
public class OrderService {

	@Autowired //Para que o spring faça a injenção de dependência
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}

