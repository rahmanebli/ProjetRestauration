package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class MotifLB {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdLB;
	 private int IdMotif;
	 private String DetailLB;
	
	 @JsonIgnore
		@ManyToOne
		private MotifLB motiflb;
}
