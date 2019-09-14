package com.emi.MonEcole.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emi.MonEcole.entities.Professeur;

public interface ProfesseurRepository extends JpaRepository<Professeur,String>{

}
