package com.ayari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayari.model.Site;

@Repository
public interface SiteRepository extends JpaRepository<Site,Integer> {

}
