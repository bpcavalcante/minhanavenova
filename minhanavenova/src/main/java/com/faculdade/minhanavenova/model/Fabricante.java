package com.faculdade.minhanavenova.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_FABRICANTE")
public class Fabricante {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(max = 30)
	private String nome;
	
	@OneToMany(mappedBy = "fabricante" , cascade = CascadeType.ALL )
	@JsonIgnoreProperties("fabricante")
	private List<Modelo> modelo;
	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Modelo> getModelo() {
		return modelo;
	}

	public void setModelo(List<Modelo> modelo) {
		this.modelo = modelo;
	}

	
	
	
	
	

}
