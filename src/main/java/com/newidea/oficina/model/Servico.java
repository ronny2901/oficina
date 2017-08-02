package com.newidea.oficina.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idServico;
	
	private String unidade;
	private int quantidade;
	private String descricao;
	private double valorUnitario;
	private double valorTotal;
	private double TotalGeral;
	
}//fim da classe
