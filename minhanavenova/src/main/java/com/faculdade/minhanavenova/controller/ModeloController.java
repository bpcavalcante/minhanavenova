package com.faculdade.minhanavenova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.minhanavenova.model.Modelo;
import com.faculdade.minhanavenova.repository.ModeloRepository;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/modelo")
public class ModeloController {

	@Autowired
	private ModeloRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Modelo>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Modelo> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Modelo> post(@RequestBody Modelo modelo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(modelo));
	}
	
	@PutMapping
	public ResponseEntity<Modelo> put(@RequestBody Modelo modelo){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(modelo));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
