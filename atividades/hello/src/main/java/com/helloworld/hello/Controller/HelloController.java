package com.helloworld.hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos-de-aprendizagem")

public class HelloController {

	
	@GetMapping
		public String hello() {
			return "Os objetivos de aprendizagem são: não sei, é só pra fazer teste";
		}
	
}
