package com.helloword.helo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping ("/hello")
	public String hello () {
		return "Hello World!";
	}
	@GetMapping("/BSM")
	public String BSM () {
		return "\n >Orientação ao Futuro\n"+
			   "\n >Responsabilidade Pessoal\n"+
			   "\n >Mentalidade de Crescimento\n"+
			   "\n >Persistência\n"+
			   "\n >Trabalho em Equipe\n"+
			   "\n >Atenção aos Detalhes\n"+
			   "\n >Proatividade\n"+
			   "\n >Comunicação\n";
	}
	@GetMapping ("/Objetivos")
	public String ObjetivosDeAprendizagem () {
		return "Objetivo: Interagir com a IDE Spring Boot, a fim de utilizar a linguagem Java com a aplicação de frameworks.";
	}
}
