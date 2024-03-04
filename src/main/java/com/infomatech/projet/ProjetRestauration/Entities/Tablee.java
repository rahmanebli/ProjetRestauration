package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Tablee {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdTable;
	 private int NumTable;
	 private int CapaciteTable;
	 private String StatutTable;
	
	 @JsonIgnore
		@ManyToOne
		private Tablee tablee;

}

