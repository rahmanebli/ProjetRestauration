package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomatech.projet.ProjetRestauration.DAO.BonRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Bon;


@Service
public class serviceBon implements IserviceBon{
	@Autowired
	private BonRepository br;

	@Override
	public void createBon(Bon b) {
		  br.save(b);	
		
	}
	@Override
	public void deleteBon(Long idBon) {
		 br.deleteById(idBon);	
		
	}

	@Override
	public void updateBon(Bon b) {
		 br.save(b);	
	}

	@Override
	public Bon getBonById(Long idBon) {
		return br.findById(idBon).get();

	}

	@Override
	public List<Bon> getAllBons() {
		return br.findAll();
	}
	

}
