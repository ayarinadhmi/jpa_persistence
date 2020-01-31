package com.ayari.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="segement")
@SequenceGenerator(name = "seq", sequenceName = "seq_segement", allocationSize = 1)
public class Segement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private Integer id;
	
	private String nom ; 
	
	private String description ;


    /*@OneToMany(mappedBy = "segement",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<ArticleTitre> articles = new ArrayList<ArticleTitre>();*/
	
	public Segement(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}

	public Segement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Segement(Integer id, String nom, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
	}
	
	/*public void addArticle(ArticleTitre article) {
		articles.add(article);
		article.setSegement(this);
    }*/
	
	/*public void removeArticle(ArticleTitre article) {
		articles.remove(article);
		article.setSegement(null);
    }*/

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	} 
	
	
}
