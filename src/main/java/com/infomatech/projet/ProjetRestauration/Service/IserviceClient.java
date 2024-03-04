package com.infomatech.projet.ProjetRestauration.Service;

import java.util.List;

import com.infomatech.projet.ProjetRestauration.Entities.Client;



public interface IserviceClient {
	public void addClient(Client c);
	public void updateClient(Client c);
	public void deleteClient(Long idC);
	public Client getClientById(Long idC);
	public List<Client>getAllClients();
	public List<Client> getClientsBMC(String mc);

}
