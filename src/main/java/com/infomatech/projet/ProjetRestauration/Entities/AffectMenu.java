package com.infomatech.projet.ProjetRestauration.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public @Entity class AffectMenu {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long IdAffectM;
	 private int IdFamille;
	 private int IdArticle;
	 private int IdMenu;
	 private int Quantite;
	 
	 @JsonIgnore
		@ManyToOne
		private AffectMenu affectmenu;

}
