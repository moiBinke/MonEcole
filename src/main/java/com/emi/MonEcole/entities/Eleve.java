package com.emi.MonEcole.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Eleve {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long idEleve;
	@Column
	private String nomEleve;
	@Column
	private String prenomEleve;
	@Column
	private String sexe;
	@Column
	private String situationSociale;
	@Column
	private Date   dateDeNaissance;
	@Column
	private String lieuDeNaissance;
	@Column
	private String etatSanitaire;
	@Column
	private String situationFamilisale;
	@Column
	private String telephone;
	@Column
	private String adresse;
	@Column
	private String email;
	private String etablissementOrigine;
	@Column
	private String estRedoublant;
	@Column
	private String estBoursier;
	@Column
	private String estAbonneCantine;
	@Column
	private String estAbonneBibliotheque;
	@Column
	private String estPrisEnChargeEnFourniture;
	@Column
	private String nomParent;
	@Column
	private String prenomParent;
	@Column
	private String emailParent;
	@Column
	private String telephoneParent;
	@Column
	private String professionParent;
	@Column
	private String adresseParent;
	@Column
	private String photoEleve;
	
	@OneToOne
	private Classe classe;
	@OneToMany
	private Collection<Note>notes;
	public Eleve(Long idEleve, String nomEleve, String prenomEleve, String sexe, String situationSociale,
			Date dateDeNaissance, String lieuDeNaissance, String etatSanitaire, String situationFamilisale,
			String telephone, String adresse, String email, String etablissementOrigine, String estRedoublant,
			String estBoursier, String estAbonneCantine, String estAbonneBibliotheque,
			String estPrisEnChargeEnFourniture, String nomParent, String prenomParent, String emailParent,
			String telephoneParent, String professionParent, String adresseParent, String photoEleve, Classe classe,
			Collection<Note> notes) {
		super();
		this.idEleve = idEleve;
		this.nomEleve = nomEleve;
		this.prenomEleve = prenomEleve;
		this.sexe = sexe;
		this.situationSociale = situationSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.etatSanitaire = etatSanitaire;
		this.situationFamilisale = situationFamilisale;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
		this.etablissementOrigine = etablissementOrigine;
		this.estRedoublant = estRedoublant;
		this.estBoursier = estBoursier;
		this.estAbonneCantine = estAbonneCantine;
		this.estAbonneBibliotheque = estAbonneBibliotheque;
		this.estPrisEnChargeEnFourniture = estPrisEnChargeEnFourniture;
		this.nomParent = nomParent;
		this.prenomParent = prenomParent;
		this.emailParent = emailParent;
		this.telephoneParent = telephoneParent;
		this.professionParent = professionParent;
		this.adresseParent = adresseParent;
		this.photoEleve = photoEleve;
		this.classe = classe;
		this.notes = notes;
	}
	public Long getIdEleve() {
		return idEleve;
	}
	public void setIdEleve(Long idEleve) {
		this.idEleve = idEleve;
	}
	public String getNomEleve() {
		return nomEleve;
	}
	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}
	public String getPrenomEleve() {
		return prenomEleve;
	}
	public void setPrenomEleve(String prenomEleve) {
		this.prenomEleve = prenomEleve;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
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
	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}
	public void setLieuDeNaissance(String lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}
	public String getEtatSanitaire() {
		return etatSanitaire;
	}
	public void setEtatSanitaire(String etatSanitaire) {
		this.etatSanitaire = etatSanitaire;
	}
	public String getSituationFamilisale() {
		return situationFamilisale;
	}
	public void setSituationFamilisale(String situationFamilisale) {
		this.situationFamilisale = situationFamilisale;
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
	public String getEtablissementOrigine() {
		return etablissementOrigine;
	}
	public void setEtablissementOrigine(String etablissementOrigine) {
		this.etablissementOrigine = etablissementOrigine;
	}
	public String getEstRedoublant() {
		return estRedoublant;
	}
	public void setEstRedoublant(String estRedoublant) {
		this.estRedoublant = estRedoublant;
	}
	public String getEstBoursier() {
		return estBoursier;
	}
	public void setEstBoursier(String estBoursier) {
		this.estBoursier = estBoursier;
	}
	public String getEstAbonneCantine() {
		return estAbonneCantine;
	}
	public void setEstAbonneCantine(String estAbonneCantine) {
		this.estAbonneCantine = estAbonneCantine;
	}
	public String getEstAbonneBibliotheque() {
		return estAbonneBibliotheque;
	}
	public void setEstAbonneBibliotheque(String estAbonneBibliotheque) {
		this.estAbonneBibliotheque = estAbonneBibliotheque;
	}
	public String getEstPrisEnChargeEnFourniture() {
		return estPrisEnChargeEnFourniture;
	}
	public void setEstPrisEnChargeEnFourniture(String estPrisEnChargeEnFourniture) {
		this.estPrisEnChargeEnFourniture = estPrisEnChargeEnFourniture;
	}
	public String getNomParent() {
		return nomParent;
	}
	public void setNomParent(String nomParent) {
		this.nomParent = nomParent;
	}
	public String getPrenomParent() {
		return prenomParent;
	}
	public void setPrenomParent(String prenomParent) {
		this.prenomParent = prenomParent;
	}
	public String getEmailParent() {
		return emailParent;
	}
	public void setEmailParent(String emailParent) {
		this.emailParent = emailParent;
	}
	public String getTelephoneParent() {
		return telephoneParent;
	}
	public void setTelephoneParent(String telephoneParent) {
		this.telephoneParent = telephoneParent;
	}
	public String getProfessionParent() {
		return professionParent;
	}
	public void setProfessionParent(String professionParent) {
		this.professionParent = professionParent;
	}
	public String getAdresseParent() {
		return adresseParent;
	}
	public void setAdresseParent(String adresseParent) {
		this.adresseParent = adresseParent;
	}
	public String getPhotoEleve() {
		return photoEleve;
	}
	public void setPhotoEleve(String photoEleve) {
		this.photoEleve = photoEleve;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Collection<Note> getNotes() {
		return notes;
	}
	public void setNotes(Collection<Note> notes) {
		this.notes = notes;
	}

	
	
}