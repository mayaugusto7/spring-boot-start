package com.mayribeiro.contatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mayribeiro.contatos.model.Contato;
import com.mayribeiro.contatos.repository.ContatosRepository;

@Controller
@RequestMapping("/contatos")
public class ContatosController {

	@Autowired
	private ContatosRepository contatosRepository;
	
	@GetMapping
	public ModelAndView listar() {
		List<Contato> lista = contatosRepository.findAll(); 
		
		ModelAndView modelAndView = new ModelAndView("contatos");
		modelAndView.addObject("contatos", lista);
		
		return modelAndView;
	}
}
