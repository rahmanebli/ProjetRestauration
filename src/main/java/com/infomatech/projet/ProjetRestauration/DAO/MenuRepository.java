package com.infomatech.projet.ProjetRestauration.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infomatech.projet.ProjetRestauration.Entities.Menu;

public interface MenuRepository extends JpaRepository<Menu ,Long>{
	public List<Menu> findBynomContains(String mc);
}
