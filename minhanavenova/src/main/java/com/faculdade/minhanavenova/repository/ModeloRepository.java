package com.faculdade.minhanavenova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.minhanavenova.model.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

	public List<Modelo> findAllByNomeContainingIgnoreCase(String nome);
}
