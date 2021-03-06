package com.devti.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devti.course.entities.Category;
import com.devti.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	//Retorna respostas de requisições web
	@GetMapping //Indica que esse método responde a requisição do tipo Get do HTTP
	public ResponseEntity<List<Category>> findAll(){
		List <Category> list = service.findAll();
		return ResponseEntity.ok().body(list); //Retorna resposta com sucesso / retornar corpo da resposta
	}
	
	@GetMapping(value = "/{id}") //Diz que a URL terá um parâmetro
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
