package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomatech.projet.ProjetRestauration.DAO.FamilleRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Famille;

@Service
public class serviceFamille implements IserviceFamille{
	@Autowired
	private FamilleRepository fr;

	@Override
	public void addFamille(Famille f) {
		  fr.save(f);	
		
	}
	@Override
	public void deleteFamille(Long idFamille) {
		 fr.deleteById(idFamille);	
		
	}

	@Override
	public void updateFamille(Famille f) {
		 fr.save(f);	
	}

	@Override
	public Famille getFamilleById(Long idFamille) {
		return fr.findById(idFamille).get();

	}

	@Override
	public List<Famille> getAllFamilles() {
		return fr.findAll();
	}
	
	@Override
	public List<Famille> getFamillesBMC(String mc) {
		return fr.findByNomFamilleContains(mc);
	}
	

}
