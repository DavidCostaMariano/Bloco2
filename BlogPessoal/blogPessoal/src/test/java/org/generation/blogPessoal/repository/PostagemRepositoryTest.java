package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PostagemRepositoryTest {

	@Autowired
	private PostagemRepository repository;
	
	@BeforeAll
	public void start() {
		
		Postagem Postagem = new Postagem();/* (null, "titulo", "text", "tema", "e bla bla bla da model postagem")*/
				
		if(repository.findAllByTituloContainingIgnoreCase("titulo") == null)
		repository.save(Postagem);
	}
	public void findByNomeRetornaContato() throws Exception{
		
		List<Postagem> postagem = repository.findAllByTituloContainingIgnoreCase("chefe");
	}
	@AfterAll
	public void end() {
		repository.deleteAll();
	}
	
}
