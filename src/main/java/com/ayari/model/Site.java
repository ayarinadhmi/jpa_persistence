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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "site")
@SequenceGenerator(name = "seq", sequenceName = "seq_site", allocationSize = 1)
public class Site {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private Integer id;

	private String nom;

	@OneToMany(mappedBy = "site",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval=true)
	@Fetch(FetchMode.JOIN)
	private List<Titre> titres = new ArrayList<Titre>();
	
	public Site() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
}
