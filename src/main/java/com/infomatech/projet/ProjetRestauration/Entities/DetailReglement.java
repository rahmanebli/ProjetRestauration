package com.infomatech.projet.ProjetRestauration.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class DetailReglement {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Long idReg;
	 private  float MontantReg;
		private String TypeReg;
		private String DateDelai;
	
	
		@JsonIgnore
		 @ManyToOne 
		private DetailReglement Detailreg;

}
