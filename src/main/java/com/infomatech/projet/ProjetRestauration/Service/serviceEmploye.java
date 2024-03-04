package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomatech.projet.ProjetRestauration.DAO.EmployeRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Employe;



@Service
public class serviceEmploye implements IserviceEmploye{
	
	@Autowired
	private EmployeRepository er;

	@Override
	public void addEmploye(Employe e) {
		  er.save(e);	
		
	}
	@Override
	public void deleteEmploye(Long idEmp) {
		 er.deleteById(idEmp);	
		
	}

	@Override
	public void updateEmploye(Employe e) {
		 er.save(e);	
	}

	@Override
	public Employe getEmployeById(Long idEmp) {
		return er.findById(idEmp).get();

	}

	@Override
	public List<Employe> getAllEmployes() {
		return er.findAll();
	}
	
	@Override
	public List<Employe> getEmployesBMC(String mc) {
		return er.findBynomContains(mc);
	}
	

}
