package com.faculdade.minhanavenova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faculdade.minhanavenova.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
