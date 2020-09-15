package com.faculdade.minhanavenova.model;

import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "TB_VEICULO")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 7 , max = 7)
	private String placa;
	
	@NotNull
	private int cambio;
	
	@NotNull
	@Size(max = 10)
	private int km;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date anoFabricante;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date anoModelo;
	
	@NotNull
	private boolean licenciado;
	
	@NotNull
	private boolean ipva;
	
	@NotNull
	@Size(max = 300)
	private String descricao;
	
	@Size(max = 30)
	private double valor;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties("veiculo")
	private Cor cor;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties("veiculo")
	private Combustivel combustivel;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public Date getAnoFabricante() {
		return anoFabricante;
	}

	public void setAnoFabricante(Date anoFabricante) {
		this.anoFabricante = anoFabricante;
	}

	public Date getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Date anoModelo) {
		this.anoModelo = anoModelo;
	}

	public boolean isLicenciado() {
		return licenciado;
	}

	public void setLicenciado(boolean licenciado) {
		this.licenciado = licenciado;
	}

	public boolean isIpva() {
		return ipva;
	}

	public void setIpva(boolean ipva) {
		this.ipva = ipva;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	

	
}
