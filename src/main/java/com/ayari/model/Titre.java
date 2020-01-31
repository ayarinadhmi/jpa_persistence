package com.ayari.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="Titre")
@SequenceGenerator(name = "seq", sequenceName = "seq_titre", allocationSize = 1)
public class Titre {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private Integer id;

	private String nom;
	
	@OneToMany(mappedBy = "titre",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval=true)
	@Fetch(FetchMode.JOIN)
	private List<ArticleTitre> articles = new ArrayList<ArticleTitre>();
	
	@ManyToOne
	private Site site ; 
	
	public void addArticle(ArticleTitre article) {
		articles.add(article);
        article.setTitre(this);
    }
 
    public void removeArticle(ArticleTitre article) {
    	articles.remove(article);
    	article.setTitre(null);
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

	public List<ArticleTitre> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticleTitre> articles) {
		this.articles = articles;
	}

	public Titre() {
		super();
	}

	public Titre(String nom, List<ArticleTitre> articles) {
		super();
		this.nom = nom;
		this.articles = articles;
	}

	public Titre(String nom) {
		super();
		this.nom = nom;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
	
	
	
	
}
