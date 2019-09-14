package com.emi.MonEcole.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emi.MonEcole.entities.Classe;
import com.emi.MonEcole.entities.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere,Long>{
	
@Query("Select  matiere from Matiere matiere where matiere.classe=:classe and matiere.nomMatiere=:nomMatiere")
public Matiere chercherMatiere(@Param("classe")Classe classe,@Param("nomMatiere")String nomMatiere);
}
