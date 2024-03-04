package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Fournisseur {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Long idFr;
	 private  int idType;
	 private  int idVille;
	 
		private String NomFr;
		private String PrenomFr;
		private String AdresseFr;
		private String EmailFr;
		 private  Long TelFr;
	
		@JsonIgnore
		 @ManyToOne 
		private Fournisseur fournisseur;

}
