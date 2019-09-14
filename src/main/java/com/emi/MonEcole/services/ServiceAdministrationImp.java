package com.emi.MonEcole.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.emi.MonEcole.dao.ClasseRepository;
import com.emi.MonEcole.dao.CycleRepository;
import com.emi.MonEcole.dao.MatiereRepository;
import com.emi.MonEcole.dao.ProfesseurRepository;
import com.emi.MonEcole.entities.Classe;
import com.emi.MonEcole.entities.Cycle;
import com.emi.MonEcole.entities.Matiere;
import com.emi.MonEcole.entities.Professeur;

@Service
@Transactional
public class ServiceAdministrationImp implements ServiceAdministrationInterface{

	@Autowired
	CycleRepository gerantCycle;
	@Autowired
	ClasseRepository gerantClasse;
	@Autowired
	MatiereRepository gerantMatiere;
	@Autowired 
	ProfesseurRepository gerantProfesseur;
	
	
	public boolean ajouterCycle(String nomCycle) {
		Cycle cycle=new Cycle(nomCycle);
		if(gerantCycle.save(cycle)!=null) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean ajouterClasse(String cycle,String classe,String nombreMax) {
		Cycle cycleCorrespondant=gerantCycle.getOne(cycle);
		int nombreMaxEleve=Integer.parseInt(nombreMax);
		Classe nouvelleClasse=new Classe(classe,nombreMaxEleve,cycleCorrespondant);
		if(gerantClasse.save(nouvelleClasse)==null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public boolean ajouterMatiere(String cycle, String  nomClasse, String nomMatiere, String coefficient) {
		Cycle cycleCorrespondant=gerantCycle.getOne(cycle);
		Classe classeCorrespondante=gerantClasse.chercherClasseCorrespondante(cycleCorrespondant,nomClasse);
		short coefficientEnEntier=(short)Integer.parseInt(coefficient);
		Matiere nouvelleMatiere=new Matiere(nomMatiere,coefficientEnEntier,classeCorrespondante);
		if(gerantMatiere.save(nouvelleMatiere)==null) {
			return false;
		}
		else{
			return true;
		}
		
	}

	//Affectation de Prof
	public String[] convertirListHtmlEnTableauChaineJava(String listHtml){
		String[] listIntermediaire;
		listIntermediaire=listHtml.split(",");
		return listIntermediaire;
	}
	public List<Matiere> listeDesMatieresEnseignees(String listHtml,String nomClasse){
		String[] tableau=convertirListHtmlEnTableauChaineJava(listHtml);
		Classe classe=gerantClasse.getOne(nomClasse);
		List<Matiere> matieres=new ArrayList<Matiere>();
		for(String nomMatiere:tableau) {
			Matiere matiere=gerantMatiere.chercherMatiere(classe,nomMatiere);
			matieres.add(matiere);
		}
		System.out.println(matieres);//A supprimer
		return matieres;
	}
	public Date convertirDateHtmlEnJava(String dateHtml) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		Date dateJava = dateFormat.parse (dateHtml);
		return dateJava;
	}

	@Override
	public boolean affecterProf(String cin, String nom, String prenom, String situationSociale, String dateNaissance,
			String telephone, String adresse, String email, byte profil, String nomClasse, String nomCycle,
			String matieresAffectees) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean affecterProf(String cin, String nom, String prenom, String situationSociale, String dateNaissance,
			String telephone, String adresse, String email, MultipartFile profil, String nomClasse, String nomCycle,
			String matieresAffectees) throws IOException {
		Date dateNaissanceJava = null;
		try {
			dateNaissanceJava = convertirDateHtmlEnJava(dateNaissance);
			List<Matiere>matieres=listeDesMatieresEnseignees(matieresAffectees,nomClasse);
			//Photo de Profil
			String dossier="/MonEcole/photos/photoDesProfs/";
			byte[] bytes= profil.getBytes();
			Path chemin= Paths.get(dossier+cin+profil.getOriginalFilename());
			Files.write(chemin, bytes);
			Professeur professeur=new Professeur(cin,nom,prenom,situationSociale,dateNaissanceJava,telephone,adresse,email,chemin.toString(),matieres);
			if(gerantProfesseur.save(professeur)==null) {
				return false;
			}
			else {
				for(Matiere matiere:matieres) {
					matiere.setProfesseur(professeur);
					gerantMatiere.save(matiere);
				}
				return true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

//	@Override
//	public void enregistrerImage(MultipartFile profil) throws Exception {
//		// TODO Auto-generated method stub
//		String dossier="/MonEcole/photos/photoDesProfs/";
//		byte[] bytes= profil.getBytes();
//		Path chemin= Paths.get(dossier+profil.getOriginalFilename());
//		Files.write(chemin, bytes);
//	}
	

}