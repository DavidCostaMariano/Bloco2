package com.HelloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades-e-mentalidades")
	public class HelloController {
	
	@GetMapping
	public String hello() {
		return "      Habilidades\n=========================\n1 - Atenção aos detalhes\n\n=======================\n     Mentalidades\n=======================\n1 - Persistência";
	}
}

