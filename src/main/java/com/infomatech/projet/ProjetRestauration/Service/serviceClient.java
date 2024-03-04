package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infomatech.projet.ProjetRestauration.DAO.ClientRepository;
import com.infomatech.projet.ProjetRestauration.Entities.Client;



@Service
public class serviceClient implements IserviceClient{
	
	@Autowired
	private ClientRepository cr;

	@Override
	public void addClient(Client c) {
		  cr.save(c);	
		
	}
	@Override
	public void deleteClient(Long idC) {
		 cr.deleteById(idC);	
		
	}

	@Override
	public void updateClient(Client c) {
		 cr.save(c);	
	}

	@Override
	public Client getClientById(Long idC) {
		return cr.findById(idC).get();

	}

	@Override
	public List<Client> getAllClients() {
		return cr.findAll();
	}
	
	@Override
	public List<Client> getClientsBMC(String mc) {
		return cr.findBynomContains(mc);
	}
	

}
