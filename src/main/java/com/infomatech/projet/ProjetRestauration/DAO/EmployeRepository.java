package com.infomatech.projet.ProjetRestauration.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infomatech.projet.ProjetRestauration.Entities.Employe;

public interface EmployeRepository extends JpaRepository< Employe,Long>{
	public List<Employe> findBynomContains(String mc);

}
