package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomatech.projet.ProjetRestauration.DAO.FactureRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Facture;

@Service
public class serviceFacture implements IserviceFacture {
	@Autowired
	private FactureRepository fr;

	@Override
	public void addFacture(Facture f) {
		  fr.save(f);	
		
	}
	@Override
	public void deleteFacture(Long idFacture) {
		 fr.deleteById(idFacture);	
		
	}

	@Override
	public void updateFacture(Facture f) {
		 fr.save(f);	
	}

	@Override
	public Facture getFactureById(Long idFacture) {
		return fr.findById(idFacture).get();

	}

	@Override
	public List<Facture> getAllFactures() {
		return fr.findAll();
	}
	
	@Override
	public List<Facture> getFacturesBMC(String mc) {
		return fr.findBynomContains(mc);
	}
	

}
