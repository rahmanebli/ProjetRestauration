package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Produit;

public interface IserviceProduit {
	public void addProduit(Produit p);
	public void updateProduit(Produit p);
	public void deleteProduit(Long IdArticle);
	public Produit getProduitById(Long IdArticle);
	public List<Produit>getAllProduits();
	public List<Produit> getProduitsBMC(String mc);


}
