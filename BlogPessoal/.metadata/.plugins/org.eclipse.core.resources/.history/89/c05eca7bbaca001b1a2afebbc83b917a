package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin("*")
public class TemaController {

	@Autowired
	private TemaRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Tema>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tema> getById (@PathVariable Long id)	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/tema/{nome}")
	public ResponseEntity<List<Tema>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<Tema> post (@PathVariable Long id, @RequestBody Tema novotema){
		if(repository.findById(id) != null) {
			return ResponseEntity.badRequest().build();		
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(novotema));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Tema> put (@PathVariable Long id, @RequestBody Tema alterartema){
		if (repository.existsById(id) == false) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(repository.save(alterartema));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id){
		if (repository.existsById(id) == false){
			return ResponseEntity.badRequest().build();
		}
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
