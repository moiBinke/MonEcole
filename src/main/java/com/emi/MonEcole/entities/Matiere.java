package com.emi.MonEcole.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Matiere {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long idMatiere;
	@Column
	private String nomMatiere;
	@Column
	private short  coefficient;
	@ManyToOne
	private Professeur professeur;
	@OneToMany
	private Collection<Note>notes;
	@ManyToOne
	private Classe classe;
	
	public Matiere() {}
	public Matiere(String nomMatiere, short coefficient) {
		super();
		this.nomMatiere = nomMatiere;
		this.coefficient = coefficient;
	}
	
	
	
	public Matiere(String nomMatiere, short coefficient, Classe classe) {
		super();
		this.nomMatiere = nomMatiere;
		this.coefficient = coefficient;
		this.classe = classe;
	}

	public Matiere(Long idMatiere, String nomMatiere, short coefficient,Classe classe) {
		super();
		this.nomMatiere = nomMatiere;
		this.coefficient = coefficient;
		this.classe = classe;
	}

	public String getNomMatiere() {
		return nomMatiere;
	}
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}
	public short getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(short coefficient) {
		this.coefficient = coefficient;
	}
	public Professeur getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	public Long getIdMatiere() {
		return idMatiere;
	}
	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}
	public Collection<Note> getNotes() {
		return notes;
	}
	public void setNotes(Collection<Note> notes) {
		this.notes = notes;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
}
