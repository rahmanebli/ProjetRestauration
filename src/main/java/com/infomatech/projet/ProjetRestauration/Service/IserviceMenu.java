package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Menu;

public interface IserviceMenu {
	public void addMenu(Menu m);
	public void updateMenu(Menu m);
	public void deleteMenu(Long idM);
	public Menu getMenuById(Long idM);
	public List<Menu>getAllMenus();
	public List<Menu> getMenusBMC(String mc);


}
