package com.gabrielfilipp.cursomc.domain.enums;

public enum TypeClient {
	PERSONFISICA(0, "Person Fisica"), PERSONJURIDICA(1, "Person Juridica");

	private int cod;
	private String decricao;

	private TypeClient(int cod, String descricao) {
		this.cod = cod;
		this.decricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDecricao() {
		return decricao;
	}

	public static TypeClient toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TypeClient x : TypeClient.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id Inválido: "+cod);
		
	}
}