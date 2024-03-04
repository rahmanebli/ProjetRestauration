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

public @Entity class Reglement {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Long idReg;
	 private  int idFacture;
	 private  String DateReg;
	
	
		@JsonIgnore
		 @ManyToOne 
		private Reglement reglement;

}
