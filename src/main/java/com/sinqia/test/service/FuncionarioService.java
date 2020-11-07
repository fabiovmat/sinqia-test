package com.sinqia.test.service;

import java.util.List;


import com.sinqia.test.domain.Funcionario;



public interface FuncionarioService {


		void salvar(Funcionario funcionario);

		void editar(Funcionario funcionario);

		void excluir(Long id);

		Funcionario buscarPorId(Long id);
		
		
		List<Funcionario> buscarTodos();

	}
	
	
	
	
	
	
	

