package com.sinqia.test.domain;

public enum Hierarquia {
	
	CHEFE("CF","Chefe Departamento"),
	FUNCIONARIO("FUNC","Funcionário Departamento");
	
	private String definicao;
	
	private String descricao_cargo;
	
	Hierarquia(String definicao, String descricao_cargo){
		this.definicao = definicao;
		this.descricao_cargo = descricao_cargo;
	}

	public String getDefinicao() {
		return definicao;
	}

	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}

	public String getDescricao_cargo() {
		return descricao_cargo;
	}

	public void setDescricao_cargo(String descricao_cargo) {
		this.descricao_cargo = descricao_cargo;
	}
	
	
}
