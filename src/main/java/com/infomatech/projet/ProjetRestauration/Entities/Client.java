package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Client {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Long idC;
	 private  int idVille;
	 private  int idType;
	 private  int CodePostal;
		private String NomC;
		private String PrenomC;
		private String AdresseC;
		private int TelC;
		 private  String EmailC;
	
		@JsonIgnore
		 @ManyToOne 
		private Client client;

}
