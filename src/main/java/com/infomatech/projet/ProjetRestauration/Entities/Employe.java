package com.infomatech.projet.ProjetRestauration.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Employe {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdEmp;
	 private String NomEmp;
	 private String PrenomEmp;
	 private String Poste;
	 private String AdresseEmp;
	 private int TelEmp;
	 private String EmailEmp;
	 private String SalaireEmp;
	 private String HoraireEmp;
	 private String StatutEmp;
	 
	 @JsonIgnore
		@ManyToOne
		private Employe employe;
}
