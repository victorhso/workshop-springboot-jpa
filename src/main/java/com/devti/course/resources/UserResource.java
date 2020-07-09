package com.devti.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devti.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//Retorna respostas de requisições web
	@GetMapping //Indica que esse método responde a requisição do tipo Get do HTTP
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999-9999", "12345");
		return ResponseEntity.ok().body(u); //Retorna resposta com sucesso / retornar corpo da resposta
	}
}
