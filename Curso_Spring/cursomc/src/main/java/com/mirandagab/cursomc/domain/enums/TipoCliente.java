package com.mirandagab.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) return null;
		
		for(TipoCliente tipCliente : TipoCliente.values()) {
			if(cod == tipCliente.getCod()) return tipCliente;
		}
		
		throw new IllegalArgumentException("Código inválido: " + cod);
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
}
