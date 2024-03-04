package com.infomatech.projet.ProjetRestauration.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infomatech.projet.ProjetRestauration.Entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long>{
	public List<Restaurant> findBynomContains(String mc);
	

}
