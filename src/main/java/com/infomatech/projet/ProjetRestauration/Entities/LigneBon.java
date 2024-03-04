package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class LigneBon {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdLB;
	 private int NumBon;
	 private int Quantite;
	 private String Utilisateur;
	 
	 @JsonIgnore
		@ManyToOne
		private LigneBon lignebon;

}
