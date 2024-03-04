package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomatech.projet.ProjetRestauration.DAO.FournisseurRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Fournisseur;

@Service
public class serviceFournisseur implements IserviceFournisseur{
	@Autowired
	private FournisseurRepository fsr;

	@Override
	public void addFournisseur(Fournisseur fs) {
		  fsr.save(fs);	
		
	}
	@Override
	public void deleteFournisseur(Long idFr) {
		 fsr.deleteById(idFr);	
		
	}

	@Override
	public void updateFournisseur(Fournisseur fs) {
		 fsr.save(fs);	
	}

	@Override
	public Fournisseur getFournisseurById(Long idFr) {
		return fsr.findById(idFr).get();

	}

	@Override
	public List<Fournisseur> getAllFournisseurs() {
		return fsr.findAll();
	}
	
	@Override
	public List<Fournisseur> getFournisseursBMC(String mc) {
		return fsr.findBynomContains(mc);
	}
	

}
