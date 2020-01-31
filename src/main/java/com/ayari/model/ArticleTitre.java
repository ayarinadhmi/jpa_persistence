package com.ayari.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "article_titre")
@SequenceGenerator(name = "seq", sequenceName = "seq_article_titre", allocationSize = 1)
public class ArticleTitre {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private Integer id;

	private String nom;

	@Column(precision = 10, scale = 6)
	private Double prixUnitaire;

	@ManyToOne(cascade = CascadeType.MERGE)
	private Segement segement;
	
	@ManyToOne()
	private Titre titre;

	
	public Titre getTitre() {
		return titre;
	}

	public void setTitre(Titre titre) {
		this.titre = titre;
	}

	public ArticleTitre() {
	}

	public ArticleTitre(String nom, Double prixUnitaire) {
		
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Segement getSegement() {
		return segement;
	}

	public void setSegement(Segement segement) {
		this.segement = segement;
	}
	
	

}
