package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Employe;



public interface IserviceEmploye {
	public void addEmploye(Employe e);
	public void updateEmploye(Employe e);
	public void deleteEmploye(Long idEmp);
	public Employe getEmployeById(Long idEmp);
	public List<Employe>getAllEmployes();
	public List<Employe> getEmployesBMC(String mc);


}
