package com.emi.MonEcole.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.emi.MonEcole.entities.Cycle;



public interface CycleRepository extends JpaRepository<Cycle,String> {
	@Query("select cycle from Cycle cycle where cycle.nomCycle= :nomCycle")
	public Cycle ChercherCycleParNom(@Param("nomCycle")String nomCycle);

}
