package com.faculdade.minhanavenova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.minhanavenova.model.Opcionais;

@Repository
public interface OpcionaisRepository extends JpaRepository<Opcionais, Long>{

}
