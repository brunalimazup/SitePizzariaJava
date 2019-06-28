package br.com.java.pizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.java.pizzaria.models.PizzariaModel;
import br.com.java.pizzaria.services.PizzariaService;

@Controller
public class PizzariaController {
	
	@Autowired
	PizzariaService pizzariaService;
	
	@GetMapping("/")
	public ModelAndView menuSabores() {
		ModelAndView modelAndView = new ModelAndView("pizzaria.html");
		modelAndView.addObject("sabores", pizzariaService.saboresDisponiveis());
		return modelAndView;
	}
	@PostMapping("/menu")
	public String addSabores(PizzariaModel pizzariaModel) {
		pizzariaService.listaSabores(pizzariaModel);
		return "redirect:/";
	}
	@GetMapping("/menu")
	public ModelAndView addSabores() {
	ModelAndView modelAndView = new ModelAndView("menu.html");
	return modelAndView;
}
}