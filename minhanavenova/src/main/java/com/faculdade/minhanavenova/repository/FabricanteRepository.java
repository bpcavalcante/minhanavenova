package com.faculdade.minhanavenova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.minhanavenova.model.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long>{

	public List<Fabricante> findAllByNomeContainingIgnoreCase(String nome);
}
