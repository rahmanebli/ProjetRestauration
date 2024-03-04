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
public @Entity class Famille {
	 @Id 
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long idFamille;
	
	private String nomFamille;
	private String DesignationF;
	private String ImageFamille;
	
	
	
	@JsonIgnore
	@ManyToOne
	private Famille famille;

}
