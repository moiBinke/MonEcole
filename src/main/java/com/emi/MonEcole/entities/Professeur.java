package com.emi.MonEcole.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Professeur {
	@Id
	@Column
	private String cin;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String situationSociale;
	@Column
	private Date dateDeNaissance;
	@Column
	private String telephone;
	@Column
	private String adresse;
	@Column
	private String email;
	@Column
	private String photoProf;
	@OneToMany
	private Collection<Matiere>matieres;

	public Professeur() {
		
	}
	public Professeur(String cin, String nom, String prenom, String situationSociale, Date dateDeNaissance,
			String telephone, String adresse, String email, String photoProf) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.situationSociale = situationSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
		this.photoProf = photoProf;
	}
	
	public Professeur(String cin, String nom, String prenom, String situationSociale, Date dateDeNaissance,
			String telephone, String adresse, String email, String photoProf, Collection<Matiere> matieres) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.situationSociale = situationSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
		this.photoProf = photoProf;
		this.matieres = matieres;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSituationSociale() {
		return situationSociale;
	}

	public void setSituationSociale(String situationSociale) {
		this.situationSociale = situationSociale;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhotoProf() {
		return photoProf;
	}

	public void setPhotoProf(String photoProf) {
		this.photoProf = photoProf;
	}

	public Collection<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(Collection<Matiere> matieres) {
		this.matieres = matieres;
	}
	
	
}
