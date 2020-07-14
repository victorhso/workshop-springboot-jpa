package com.devti.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devti.course.entities.User;
import com.devti.course.repositories.UserRepository;

@Service // Registra a classe como componente do Spring
public class UserService {

	@Autowired // Para que o spring faça a injenção de dependência
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	// Inserindo no BD um novo objeto user
	public User insert(User obj) {
		return repository.save(obj);
	}
}
