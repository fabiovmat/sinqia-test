package com.sinqia.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinqia.test.dao.CargoDao;
import com.sinqia.test.domain.Cargo;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(Cargo cargo) {
		// TODO Auto-generated method stub
		dao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		// TODO Auto-generated method stub
		dao.update(cargo);
	}

	@Override
	public void exclui(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		// TODO Auto-generated method stub
		dao.findById(id);

		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		// TODO Auto-generated method stub

		return dao.findAll();
	}

}
