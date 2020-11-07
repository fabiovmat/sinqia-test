package com.sinqia.test.service;

import java.util.List;

import com.sinqia.test.domain.Departamento;;

public interface DepartamentoService {

	
		void salvar(Departamento departamento);

		void editar(Departamento departamento);

		void exclui(Long id);

		Departamento buscarPorId(Long id);

		List<Departamento> buscarTodos();

		boolean departamentoTemCargos(Long id);

	}
	
	
	
	

