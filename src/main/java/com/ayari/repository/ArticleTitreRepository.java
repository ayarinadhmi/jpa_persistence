package com.ayari.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayari.model.ArticleTitre;
import com.ayari.model.Titre;


@Repository
public interface ArticleTitreRepository extends JpaRepository<ArticleTitre,Integer> {
	List<ArticleTitre>   findByTitre(Titre t);
}
