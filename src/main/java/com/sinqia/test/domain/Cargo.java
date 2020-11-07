package com.sinqia.test.domain;

import javax.persistence.Column;

import java.util.List;

import javax.persistence.*;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


@Column(name = "cargo_nome", nullable = false, unique = true, length = 60)	
private String cargo_nome;
	

/*um departamento para muitos cargos */
@ManyToOne
@JoinColumn(name = "departamento_id_fk")
private Departamento departamento;


public List<Funcionario> getFuncionarios() {
	return funcionarios;
}


public void setFuncionarios(List<Funcionario> funcionarios) {
	this.funcionarios = funcionarios;
}


@OneToMany(mappedBy = "cargo")
private List<Funcionario> funcionarios;


public String getcargo_nome() {
	return cargo_nome;
}


public void setcargo_nome(String cargo_nome) {
	this.cargo_nome = cargo_nome;
}


public Departamento getDepartamento() {
	return departamento;
}


public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}




}
