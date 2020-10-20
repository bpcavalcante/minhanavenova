package com.faculdade.minhanavenova.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "TB_VEICULO")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/*@NotNull
	@Size(min = 7 , max = 7)
	private String placa;*/
	
	/*@NotNull
	private String cambio;*/
	
	
	private int km;
	
	
	private String anofabricante;
	
	private String foto;
	
	
	private String anomodelo;
	
	
	
	private String descricao;
	
	
	private double valor;
	
	private String modelo;
	
	/*@OneToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties("veiculo")
	private Cor cor;*/
	
	/*@OneToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties("veiculo")
	private Combustivel combustivel;*/
	
	/*@OneToOne(cascade = CascadeType.MERGE)
	@JsonIgnoreProperties("veiculo")
	private Modelo modelo;*/
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}*/

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}


	
	

	public String getAnofabricante() {
		return anofabricante;
	}

	public void setAnofabricante(String anofabricante) {
		this.anofabricante = anofabricante;
	}

	public String getAnomodelo() {
		return anomodelo;
	}

	public void setAnomodelo(String anomodelo) {
		this.anomodelo = anomodelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

	/*public Cor getCor() {
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
	}*/

	/*public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}*/
	
	
}
