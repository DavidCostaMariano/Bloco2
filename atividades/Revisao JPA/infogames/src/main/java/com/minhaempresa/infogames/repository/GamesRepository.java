package com.minhaempresa.infogames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.infogames.model.Games;

public interface GamesRepository extends JpaRepository<Games, Long>{

	public List<Games> findAllByNomeContainingIgnoreCase(String nome);
}
	
