package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class MP {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Long idMP;
	 private  int idReg;
		private String TypeMP;
		private String DescriptionMP;
	
	
		@JsonIgnore
		 @ManyToOne 
		private MP mp;

}

