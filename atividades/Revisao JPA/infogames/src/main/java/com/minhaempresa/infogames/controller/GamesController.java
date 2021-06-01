package com.minhaempresa.infogames.controller;
import java.util.List;
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
import com.minhaempresa.infogames.model.Games;
import com.minhaempresa.infogames.repository.GamesRepository;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("*")
public class GamesController {

	@Autowired
	private GamesRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Games>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Games> GetById(@PathVariable long id)
	{
		return repository.findById(id)
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/{nome}")
	public ResponseEntity<List<Games>> getByName(@PathVariable String nome) 
	{
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Games> post (@RequestBody Games game)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(game));
	}
	@PutMapping
	public ResponseEntity<Games> put (@RequestBody Games game)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(game));
	}
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
	