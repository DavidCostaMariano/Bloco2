package org.generation.blogPessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.generation.blogPessoal.model.Postagem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import net.bytebuddy.agent.VirtualMachine.ForHotSpot.Connection.Response;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PostagemControllerTest {

	@Autowired
	private TestRestTemplate testTemplate;

	private Postagem postagemPost;
	private Postagem postagemUpd;

	@BeforeAll
	public void start() {
		Postagem postagem = new Postagem();
		
	}
	
	public void deveRealizarPostPostagem() {
		HttpEntity<Postagem> request = new HttpEntity<Postagem>(postagemPost);
		ResponseEntity<Postagem> resposta = testTemplate.exchange("/postagens",HttpMethod.POST, request, Postagem.class);
		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
	} 
	
}
