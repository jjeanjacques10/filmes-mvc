package br.com.fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.fiap.repository.FilmeRepository;

@Controller
@RequestMapping("/filme")
public class FilmeController {

	//@Autowired
	//FilmeRepository repository;
	FilmeRepository repository = FilmeRepository.getInstance();

	@GetMapping()
	public String findAll(Model model) {
		model.addAttribute("filmes", repository.findAll());
		return "filme";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {

		//model.addAttribute("filme", repository.findById(id));
		return "filme-detalhe";
	}

}
