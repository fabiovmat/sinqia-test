package com.sinqia.test.service;

import java.util.List;

import com.sinqia.test.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);

	void editar(Cargo cargo);

	void exclui(Long id);

	Cargo buscarPorId(Long id);

	List<Cargo> buscarTodos();

}
