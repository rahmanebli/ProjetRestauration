package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Fournisseur;

public interface IserviceFournisseur {
	public void addFournisseur(Fournisseur fsr);
	public void updateFournisseur(Fournisseur fsr);
	public void deleteFournisseur(Long idFr);
	public Fournisseur getFournisseurById(Long idFr);
	public List<Fournisseur>getAllFournisseurs();
	public List<Fournisseur> getFournisseursBMC(String mc);

}
