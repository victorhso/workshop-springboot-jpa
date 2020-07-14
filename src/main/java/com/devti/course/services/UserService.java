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

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User entity = repository.getOne(id); // Instancia um usuário um objeto monitorado no JPA e em seguida fazer
												// operação com BD
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
