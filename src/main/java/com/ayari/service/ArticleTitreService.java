package com.ayari.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayari.repository.ArticleTitreRepository;

@Service
public class ArticleTitreService {

	
	@Autowired
	private ArticleTitreRepository articleRepo;

}
