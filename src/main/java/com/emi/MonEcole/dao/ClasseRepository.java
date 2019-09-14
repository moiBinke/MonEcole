package com.emi.MonEcole.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emi.MonEcole.entities.Classe;
import com.emi.MonEcole.entities.Cycle;

public interface ClasseRepository  extends JpaRepository<Classe,String> {
	@Query("select classe from Classe classe where classe.cycleCorrespondant= :cycle and classe.nomClasse=:nomClasse")
	public Classe chercherClasseCorrespondante(@Param("cycle")Cycle cycle,@Param("nomClasse")String nomClasse);

}
