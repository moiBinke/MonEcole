package com.emi.MonEcole.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Classe {
	@Id
	@Column
	private String nomClasse;
	@Column
	private Integer nombreMaximalEleve;
	@ManyToOne
	private Cycle cycleCorrespondant;
	@OneToMany
	private Collection <Matiere> matieres;
	@OneToMany
	private Collection<Eleve> eleves;
	
	public Classe() {}
	public Classe(String nomClasse, Integer nombreMaximalEleve,Cycle cycleCorrespondant) {
		super();
		this.nomClasse = nomClasse;
		this.nombreMaximalEleve = nombreMaximalEleve;
		this.cycleCorrespondant=cycleCorrespondant;
	}
	public String getNomClasse() {
		return nomClasse;
	}
	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}
	public Integer getNombreMaximalEleve() {
		return nombreMaximalEleve;
	}
	public void setNombreMaximalEleve(Integer nombreMaximalEleve) {
		this.nombreMaximalEleve = nombreMaximalEleve;
	}
	public Cycle getCycleCorrespondant() {
		return cycleCorrespondant;
	}
	
	
}
