package com.ayari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayari.model.Titre;
@Repository
public interface TitreRepository  extends JpaRepository<Titre,Integer>{

}
