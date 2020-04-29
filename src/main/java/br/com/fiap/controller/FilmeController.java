package br.com.fiap.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.model.FilmeModel;
import br.com.fiap.repository.FilmeRepository;

@Controller
@RequestMapping("/filme")
public class FilmeController {

	@Autowired
	FilmeRepository repository;

	@GetMapping("/form")
	public String open(@RequestParam String page, @RequestParam(required = false) Long id,
			 Model model) {
		System.out.println(page);
		if ("filme-editar".contentEquals(page)) {
			model.addAttribute("filmeModel", repository.findById(id));
		}

		return page;
	}

	@GetMapping()
	public String findAll(Model model) {
		model.addAttribute("filmes", repository.findAll());
		return "filme";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {

		model.addAttribute("filme", repository.findById(id));
		return "filme-detalhe";
	}

	@PostMapping()
	public String save(@Valid FilmeModel filmeModel, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {

		if (bindingResult.hasErrors()) {
			return "filme-novo";
		}

		repository.save(filmeModel);
		redirectAttributes.addFlashAttribute("messages", "Filme cadastrado com sucesso!");

		return "redirect:/filme";
	}

	@PutMapping("/{id}")
	public String update(@PathVariable("id") long id, Model model, @Valid FilmeModel filmeModel,
			BindingResult bindingResult, RedirectAttributes redirectAttributes) {

		if (bindingResult.hasErrors()) {
			return "filme-editar";
		}

		filmeModel.setId(id);
		repository.update(filmeModel);
		redirectAttributes.addFlashAttribute("messages", "Filme alterado com sucesso!");

		return "redirect:/filme";
	}

	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {

		repository.deleteById(id);
		redirectAttributes.addFlashAttribute("messages", "Produto excluído com sucesso!");
		return "redirect:/filme";
	}
}
