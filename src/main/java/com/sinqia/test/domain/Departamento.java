package com.sinqia.test.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Column(name = "nome", nullable = false, unique = true, length = 60)	
private String departamento_nome;


@OneToMany(mappedBy = "departamento")
private List<Cargo> cargo;


public List<Cargo> getCargo() {
	return cargo;
}

public void setCargo(List<Cargo> cargo) {
	this.cargo = cargo;
}

public String getDepartamento_nome() {
	return departamento_nome;
}

public void setDepartamento_nome(String departamento_nome) {
	this.departamento_nome = departamento_nome;
}
	

}
