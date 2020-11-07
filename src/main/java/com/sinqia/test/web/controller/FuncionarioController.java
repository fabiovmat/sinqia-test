package com.sinqia.test.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sinqia.test.domain.Cargo;
import com.sinqia.test.domain.Funcionario;
import com.sinqia.test.domain.Hierarquia;
import com.sinqia.test.service.CargoService;
import com.sinqia.test.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioService service;
	
	@Autowired
	CargoService cargoService;

	@GetMapping("/cadastrar")
	public String cadastrar(Funcionario funcionario) {
		return "/funcionario/cadastro";

	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("funcionarios",service.buscarTodos());
		return "/funcionario/lista";

	}

	@PostMapping("/salvar")
	public String salvar(Funcionario funcionario, RedirectAttributes attr) {
		service.salvar(funcionario);
		attr.addFlashAttribute("sucess", "Funcionario inserido com sucesso.");
		return "redirect:/funcionarios/cadastrar";
	}
	
	
	@GetMapping("/editar/id")
	public String preEditar(@PathVariable("id")Long id, ModelMap model) {
		model.addAttribute("funcionarios", service.buscarPorId(id));
		return "/funcionarios/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Funcionario funcionario, RedirectAttributes attr) {
		service.editar(funcionario);
		attr.addFlashAttribute("sucess", "Funcionário editado com sucesso.");
		return "redirect:/funcionarios/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir (@PathVariable("id")Long id, RedirectAttributes attr) {
		service.excluir(id);
		attr.addFlashAttribute("sucess","Funcionario removido com sucesso.");
		return "redirect:/funcionarios/listar";
		}
	
	@ModelAttribute("cargos")
	public List<Cargo>getCargos(){
		return cargoService.buscarTodos();
		
	}
	
	@ModelAttribute("hierarquia")
	public Hierarquia[] getHierarquias() {
		return Hierarquia.values();
	}
	
	

}
