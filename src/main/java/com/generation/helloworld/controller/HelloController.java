package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/bsm")
	public String listaBsm() {
		return "<b>Persistência</br>Mentalidade de Crescimento</br>Proatividade</br>Orientação ao Futuro</br>Responsabilidade Pessoal</br>Comunicação</b>";
	}
	
	@GetMapping("/objetivo")
	public String objetivoAprendizagem() {
		return "<b>Proatividade</b>";
	}
}
