package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Famille;

public interface IserviceFamille {
	public void addFamille(Famille f);
	public void updateFamille(Famille f);
	public void deleteFamille(Long idFamille);
	public Famille getFamilleById(Long idFamille);
	public List<Famille>getAllFamilles();
	public List<Famille> getFamillesBMC(String mc);


}
