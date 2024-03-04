package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Motif {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdMotif;
	 private String NomMotif;
	 private String DescriptionMotif;
	 private String TypeMotif;
	 
	 @JsonIgnore
		@ManyToOne
		private Motif motif;

}
