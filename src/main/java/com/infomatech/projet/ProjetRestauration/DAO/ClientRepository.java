package com.infomatech.projet.ProjetRestauration.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infomatech.projet.ProjetRestauration.Entities.Client;



public interface ClientRepository extends JpaRepository<Client,Long>{
	public List<Client> findBynomContains(String mc);

}
