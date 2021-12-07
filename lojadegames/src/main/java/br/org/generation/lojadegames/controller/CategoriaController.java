package br.org.generation.lojadegames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.lojadegames.model.Categoria;
import br.org.generation.lojadegames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity <List<Categoria>> getAll(){
		
		return ResponseEntity.ok(categoriaRepository.findAll());
	}
	
	
	@GetMapping("descricao/{descicao}")
	public ResponseEntity<List<Categoria>> getByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(categoriaRepository.findAllCategoriaContainingIgnoreCase(descricao));
	}
	
	
	
}
