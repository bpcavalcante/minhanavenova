package com.faculdade.minhanavenova.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faculdade.minhanavenova.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public List<User> findAllByNomeContainingIgnoreCase(String nome);
	
	public Optional<User> findByUsuario(String usuario);
}
