package com.faculdade.minhanavenova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.minhanavenova.model.Combustivel;

@Repository
public interface CombustivelRepository extends JpaRepository<Combustivel, Long> {

	public List<Combustivel> findAllByNomeContainingIgnoreCase(String nome);
	
}
