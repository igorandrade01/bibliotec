package br.com.aprendizagem.bibliotec.controllers;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aprendizagem.bibliotec.models.Livro;
import br.com.aprendizagem.bibliotec.repositories.LivroRepository;

@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private LivroRepository repository;
	
	@PostMapping
	public ResponseEntity<Livro> salvarLivro(@RequestBody Livro livro) {
		repository.save(livro);
		return ResponseEntity.status(CREATED).body(livro);
	}
	
	@GetMapping
	public ResponseEntity<List<Livro>> listarLivros(){
		return ResponseEntity.status(OK).body(repository.findAll());
	}
}
