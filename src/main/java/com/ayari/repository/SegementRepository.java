package com.ayari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayari.model.Segement;

@Repository
public interface SegementRepository extends JpaRepository<Segement,Integer> {

}
