package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ctrl shift O - refaz as importações

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping
	public String helloShow() {
		return "Hello World<br	/> Bem Vindos ao Spring!";
	}
}
