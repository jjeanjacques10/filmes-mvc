package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filme")
public class FilmeController {
	@GetMapping()
	public String findAll() {
		return "filme";
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {

		//model.addAttribute("filme", repository.findById(id));
		return "filme-detalhe";
	}
	
}
