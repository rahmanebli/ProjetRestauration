package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomatech.projet.ProjetRestauration.DAO.MenuRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Menu;

@Service
public class serviceMenu implements IserviceMenu {
	@Autowired
	private MenuRepository mr;

	@Override
	public void addMenu(Menu m) {
		  mr.save(m);	
		
	}
	@Override
	public void deleteMenu(Long idM) {
		 mr.deleteById(idM);	
		
	}

	@Override
	public void updateMenu(Menu m) {
		 mr.save(m);	
	}

	@Override
	public Menu getMenuById(Long idM) {
		return mr.findById(idM).get();

	}

	@Override
	public List<Menu> getAllMenus() {
		return mr.findAll();
	}
	
	@Override
	public List<Menu> getMenusBMC(String mc) {
		return mr.findBynomContains(mc);
	}
	

}
