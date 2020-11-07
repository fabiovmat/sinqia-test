package com.sinqia.test.domain;


import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
	
	@Column (nullable = false, unique = true)
	private String funcionario_name;
	
	@Column
	private int funcionario_age;
	
	@Column (name = "funcionario_birthday",nullable = false, columnDefinition = "DATE")
	private LocalDate funcionario_birthday;
		
	@Column
	private String funcionario_document;
	
	
	@OneToOne
	@JoinColumn(name = "cargo_id_fk")
	private Cargo cargo;

	public String getNome() {
		return funcionario_name;
	}

	public void setFuncionario_nome(String funcionario_name) {
		this.funcionario_name = funcionario_name;
	
	}
	
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getFuncionario_name() {
		return funcionario_name;
	}

	public void setFuncionario_name(String funcionario_name) {
		this.funcionario_name = funcionario_name;
	}

	public int getFuncionario_age() {
		return funcionario_age;
	}

	public void setFuncionario_age(int funcionario_age) {
		this.funcionario_age = funcionario_age;
	}

	public LocalDate getFuncionario_birthday() {
		return funcionario_birthday;
	}

	public void setFuncionario_birthday(LocalDate funcionario_birthday) {
		this.funcionario_birthday = funcionario_birthday;
	}

	public String getFuncionario_document() {
		return funcionario_document;
	}

	public void setFuncionario_document(String funcionario_document) {
		this.funcionario_document = funcionario_document;
	}
	
	
	
}

