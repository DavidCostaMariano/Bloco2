package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);//findAllBy:busca tudo pelo titulo; Containing: retorna tudo o que tem dentro do titulo;Ignore Case: retorna tudo minusculo;
	
}
