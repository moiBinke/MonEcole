package com.emi.MonEcole.services;

import org.springframework.web.multipart.MultipartFile;

import com.emi.MonEcole.entities.Classe;
import com.emi.MonEcole.entities.Cycle;

public interface ServiceAdministrationInterface {
public boolean ajouterCycle(String cycle);
public boolean ajouterClasse(String cycle,String classe,String nombreMax);
public boolean ajouterMatiere(String cycle, String  nomClasse, String nomMatiere, String coefficient);
public boolean affecterProf(String cin,String nom, String prenom, String situationSociale, String dateNaissance, String telephone, String adresse, String email, byte profil, String nomClasse, String nomCycle, String matieresAffectees);
boolean affecterProf(String cin, String nom, String prenom, String situationSociale, String dateNaissance,
		String telephone, String adresse, String email, MultipartFile profil, String nomClasse, String nomCycle,
		String matieresAffectees) throws Exception ;

}
