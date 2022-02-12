package kh.esprit.tpjpaentity.services.Interfaces;

import java.util.List;

import kh.esprit.tpjpaentity.entity.Client;

public interface IClientService {

	List<Client> retrieveAllClients();
	Client addClient(Client c);
	void deleteClient(Long id);
	Client updateClient(Client c);
	Client retrieveClient(Long id); 
	
}
