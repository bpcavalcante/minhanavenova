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

import com.faculdade.minhanavenova.model.Fabricante;
import com.faculdade.minhanavenova.repository.FabricanteRepository;

@RestController
@RequestMapping("/fabricante")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FabricanteController {
	
	
	@Autowired
	private FabricanteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Fabricante>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Fabricante> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Fabricante> post (@RequestBody Fabricante fabricante){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(fabricante));
	}
	
	@PutMapping
	public ResponseEntity<Fabricante> put (@RequestBody Fabricante fabricante){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(fabricante));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	

}
