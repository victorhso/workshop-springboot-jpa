package com.devti.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devti.course.entities.Products;
import com.devti.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	//Retorna respostas de requisições web
	@GetMapping //Indica que esse método responde a requisição do tipo Get do HTTP
	public ResponseEntity<List<Products>> findAll(){
		List <Products> list = service.findAll();
		return ResponseEntity.ok().body(list); //Retorna resposta com sucesso / retornar corpo da resposta
	}
	
	@GetMapping(value = "/{id}") //Diz que a URL terá um parâmetro
	public ResponseEntity<Products> findById(@PathVariable Long id) {
		Products obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
