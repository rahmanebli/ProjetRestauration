package com.infomatech.projet.ProjetRestauration.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Produit {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdArticle;
	 private int idFamille;
	 private String NomPdt;
	 private String TypePdt;
	 private String DesignationP;
	 private String ImagePath;
	
	 @JsonIgnore
		@ManyToOne
		private Produit produit;

}
