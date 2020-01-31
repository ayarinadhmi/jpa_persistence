package com.ayari;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ayari.model.ArticleTitre;
import com.ayari.model.Segement;
import com.ayari.model.Titre;
import com.ayari.repository.ArticleTitreRepository;
import com.ayari.repository.SegementRepository;
import com.ayari.repository.TitreRepository;

@SpringBootApplication
@ComponentScan(basePackages= {"com.ayari"})
public class TestMappingApplication implements CommandLineRunner {
	
	@Autowired
	SegementRepository segementRepo;	
	
	@Autowired
	ArticleTitreRepository articleRepo;
	
	
	@Autowired
	TitreRepository titreRepo;

	public static void main(String[] args) {
		SpringApplication.run(TestMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Segement> segementListe = new ArrayList<Segement>();
		
		List<ArticleTitre> articleListe = new ArrayList<ArticleTitre>();
		
//		List<Titre> titres = new ArrayList<Titre>();
//		Titre t1 = new Titre("t1");
//		Titre t2 = new Titre("t2");
//		Titre t3 = new Titre("t3");
//		Titre t4 = new Titre("t4");
//		titres.add(t1);
//		titres.add(t2);
//		titres.add(t3);
//		titres.add(t4);
//		
//		titreRepo.saveAll(titres);
		/*
		Segement s1 = new Segement("s1","desc 1");
		Segement s2 = new Segement("s1","desc 1");
		Segement s3 = new Segement("s1","desc 1");
		Segement s4 = new Segement("s1","desc 1");
		Segement s5 = new Segement("s1","desc 1");
		
		segementListe.add(s1);
		segementListe.add(s2);
		segementListe.add(s3);
		segementListe.add(s4);
		segementListe.add(s5);
		segementRepo.saveAll(segementListe);
		*/
		
		ArticleTitre a1 = new ArticleTitre("a30",100.124);
		ArticleTitre a2 = new ArticleTitre("a31",100.124);
		ArticleTitre a3 = new ArticleTitre("a32",100.124);
		ArticleTitre a4 = new ArticleTitre("a33",100.124);
		List<ArticleTitre> liste = new ArrayList<ArticleTitre>();
		liste.add(a1);
		liste.add(a2);
		liste.add(a3);
		liste.add(a4);
//		Optional<Segement> seg = segementRepo.findById(4);
//		Optional<Titre> titre = titreRepo.findById(1);
//		a1.setSegement(seg.get());
//		a1.setTitre(titre.get());
//		articleRepo.save(a1);
//		articleRepo.save(a2);
//		articleRepo.save(a3);
//		articleRepo.save(a4);
		Titre titre1 = titreRepo.findById(3).get();
		
		for(ArticleTitre a : liste) {
			titre1.addArticle(a);
			
		}
		titreRepo.save(titre1);
//		List<ArticleTitre> articles = articleRepo.findAll();
//		
//		for(ArticleTitre a: articles ) {
//			a.setTitre(titre1);
//			articleRepo.save(a);
//		}
		
	//		titreRepo.deleteById(2);
	
		
		
		
		
	}

}
