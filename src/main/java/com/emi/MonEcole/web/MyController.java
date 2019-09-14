package com.emi.MonEcole.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.emi.MonEcole.dao.ClasseRepository;
import com.emi.MonEcole.dao.CycleRepository;
import com.emi.MonEcole.entities.Cycle;
import com.emi.MonEcole.services.ServiceAdministrationImp;
import com.emi.MonEcole.services.ServiceAdministrationInterface;


@Controller
public class MyController {
	
	

	@Autowired
	ServiceAdministrationInterface metierEcole;
	
	ServiceAdministrationImp serveur=new ServiceAdministrationImp();
	@RequestMapping("/serviceAdministration")
	public String afficherAdministration() {
		return "pageAdministration";
	}
	
	@RequestMapping("/ajouterCycle")
	public String ajouterCycle(String nomCycle) {
		metierEcole.ajouterCycle(nomCycle);
		return "pageAdministration";
	}
	
	@RequestMapping("/ajouterClasse")
	public String ajouterClasse(String cycle, String classe, String nombreMax) {
		metierEcole.ajouterClasse(cycle, classe, nombreMax);
		return "pageAdministration";
	}
	@RequestMapping("/affecterMatiere")
	public String affecterMatiere(String cycle, String  nomClasse, String nomMatiere, String coefficient) {
		metierEcole.ajouterMatiere(cycle, nomClasse, nomMatiere, coefficient);
		return "pageAdministration";
	}
	@PostMapping("/affecterProf")
	public String affecterProf(String cin,String nom, String prenom, String situationSociale, String dateNaissance, String telephone, String adresse, String email,MultipartFile profil, String nomClasse, String nomCycle, String matieresAffectees) {
		try {
			metierEcole.affecterProf(cin, nom, prenom, situationSociale, dateNaissance, telephone, adresse, email, profil, nomClasse, nomCycle, matieresAffectees);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "pageAdministration";
	}
}