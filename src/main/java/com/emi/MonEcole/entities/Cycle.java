package com.emi.MonEcole.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Cycle {
	@Id
	@Column
	private String nomCycle;
	@OneToMany
	public Collection<Classe> classes;
	
	public Cycle() {
		
	}
	public Cycle(String nomCycle) {
		super();
		this.nomCycle = nomCycle;
	}
	public String getNomCycle() {
		return nomCycle;
	}
	public void setNomCycle(String nomCycle) {
		this.nomCycle = nomCycle;
	}

}
