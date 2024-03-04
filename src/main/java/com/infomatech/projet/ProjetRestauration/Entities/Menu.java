package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class Menu {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdM;
	 private String NomMenu;
	 private float PrixMenu;
	 private String DesignationM;
	 private String ImagePath;
	 private String DescriptionMenu;
	 private String Evaluation;
	 
	 @JsonIgnore
		@ManyToOne
		private Menu menu;
	
}
