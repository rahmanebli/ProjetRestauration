package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Facture {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Long idFacture;
	 private  int idType;
	 private  int NumFacture;
	 private  int idReg;
		private String Total;
	
	
		@JsonIgnore
		 @ManyToOne 
		private Facture facture;

}
