package com.newidea.oficina.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVeiculo;
	
	@NotNull(message="Fabricante não pode estar em branco.") //validação
	private String fabricante;
	
	@NotNull(message="Modelo não pode estar em branco.") //validação
	private String modelo;
	private String cor;
	private int km;
	private String Combustivel;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date anoVeiculo;
	private String placa;
	public long getidVeiculo() {
		return idVeiculo;
	}
	public void setidVeiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getCombustivel() {
		return Combustivel;
	}
	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}
	public Date getAnoVeiculo() {
		return anoVeiculo;
	}
	public void setAnoVeiculo(Date anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idVeiculo ^ (idVeiculo >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (idVeiculo != other.idVeiculo)
			return false;
		return true;
	}	
	
}//fim da classe
