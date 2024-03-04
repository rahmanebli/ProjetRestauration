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
public @Entity class Restaurant {
	 @Id 
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long idResto;
	private int telResto;
	private String nomResto;
	private String adresseSte;
	private int telSte;
	private int nbresousresto;
	private int nbreEmployes;
	private String emailSte;
	
	
	
	@JsonIgnore
	@ManyToOne
	private Restaurant restaurant;

}
