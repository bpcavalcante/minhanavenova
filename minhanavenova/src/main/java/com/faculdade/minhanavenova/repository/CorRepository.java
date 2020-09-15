package com.faculdade.minhanavenova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.minhanavenova.model.Cor;

@Repository
public interface CorRepository extends JpaRepository<Cor, Long> {
	
	public List<Cor> findAllByNomeContainingIgnoreCase(String nome);
	
}
