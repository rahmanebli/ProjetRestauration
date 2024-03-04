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

public @Entity class Bon {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Long idBon;
	 private  int idFacture;
	 private  int idTypeBon;
	 private  int idReg;
		private String Article;
		private String Total;
		private String Etat;
		private String StatutBon;
		 private  int QuantiteBon;
	
		@JsonIgnore
		 @ManyToOne 
		private Bon bon;

}
