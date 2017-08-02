package com.newidea.oficina.model;

public enum StatusCliente {
	
	FISICA("Física"),
	JURIDICA("Jurídica");
	
	private String descricao;
	
	StatusCliente(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}

}
