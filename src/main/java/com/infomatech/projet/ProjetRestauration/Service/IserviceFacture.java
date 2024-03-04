package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Facture;

public interface IserviceFacture {
	public void addFacture(Facture f);
	public void updateFacture(Facture f);
	public void deleteFacture(Long idFacture);
	public Facture getFactureById(Long idFacture);
	public List<Facture>getAllFactures();
	public List<Facture> getFacturesBMC(String mc);


}
