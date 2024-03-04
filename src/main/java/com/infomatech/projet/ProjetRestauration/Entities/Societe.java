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
public @Entity class Societe {
	
	 @Id 
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long idSte;
	private String matricule;
	private String nomSte;
	private String adresseSte;
	private int telSte;
	private int nbresousresto;
	private int nbreEmployes;
	private String emailSte;
	
	
	
	@JsonIgnore
	@ManyToOne
	private Societe societe;

}
