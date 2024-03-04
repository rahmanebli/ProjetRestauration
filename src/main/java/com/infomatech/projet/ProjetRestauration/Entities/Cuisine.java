package com.infomatech.projet.ProjetRestauration.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor


public @Entity class Cuisine {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdCuisine;
	 private String NomCuisine;
	 private String TypeCuisine;
	 private int NbreChefs;
	 private String StatutCuisine;

}
