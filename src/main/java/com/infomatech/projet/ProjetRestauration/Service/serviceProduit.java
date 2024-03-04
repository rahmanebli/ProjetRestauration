package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomatech.projet.ProjetRestauration.DAO.ProduitRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Produit;

@Service
public class serviceProduit implements IserviceProduit{
	@Autowired
	private ProduitRepository pr;

	@Override
	public void addProduit(Produit p) {
		  pr.save(p);	
		
	}
	@Override
	public void deleteProduit(Long IdArticle) {
		 pr.deleteById(IdArticle);	
		
	}

	@Override
	public void updateProduit(Produit p) {
		 pr.save(p);	
	}

	@Override
	public Produit getProduitById(Long IdArticle) {
		return pr.findById(IdArticle).get();

	}

	@Override
	public List<Produit> getAllProduits() {
		return pr.findAll();
	}
	
	@Override
	public List<Produit> getProduitsBMC(String mc) {
		return pr.findByNomContains(mc);
	}
	

}
