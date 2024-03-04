package com.infomatech.projet.ProjetRestauration.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infomatech.projet.ProjetRestauration.Entities.Produit;

public interface ProduitRepository extends JpaRepository< Produit,Long>{
	public List<Produit> findByNomContains(String mc);

}
