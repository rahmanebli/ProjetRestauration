package com.infomatech.projet.ProjetRestauration.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infomatech.projet.ProjetRestauration.Entities.Famille;

public interface FamilleRepository extends JpaRepository<Famille,Long>{
	public List<Famille> findByNomFamilleContains(String mc);

}
