package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Bon;

public interface IserviceBon {
	public void createBon(Bon b);
	public void updateBon(Bon b);
	public void deleteBon(Long idBon);
	public Bon getBonById(Long idBon);
	public List<Bon>getAllBons();
	

}
