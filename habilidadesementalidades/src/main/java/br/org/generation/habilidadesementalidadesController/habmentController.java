package br.org.generation.habilidadesementalidadesController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidadesementalidades")
public class habmentController {

	@GetMapping
	public String Show() {
		return "Mentalidade utilizada: Persistência<br />Habilidade Utilizada: Atenção aos Detalhes";
	}
}
