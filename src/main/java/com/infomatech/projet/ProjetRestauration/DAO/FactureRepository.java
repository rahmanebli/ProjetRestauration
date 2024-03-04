package com.infomatech.projet.ProjetRestauration.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Facture;

public interface FactureRepository extends JpaRepository<Facture ,Long>{
	public List<Facture> findBynomContains(String mc);

}
