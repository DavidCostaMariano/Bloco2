package com.minhaempresa.infogames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.infogames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
