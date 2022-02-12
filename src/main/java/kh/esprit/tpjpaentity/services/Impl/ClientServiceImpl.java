package kh.esprit.tpjpaentity.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.esprit.tpjpaentity.entity.Client;
import kh.esprit.tpjpaentity.repositories.ClientRepository;
import kh.esprit.tpjpaentity.services.Interfaces.IClientService;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		
		List<Client> clients = (List<Client>) clientRepository.findAll();
		// return clients.size();  int
		return clients;
	}

	@Override
	public Client addClient(Client c) {
		
		clientRepository.save(c);
		
		return c;
	}

	@Override
	public void deleteClient(Long id) {
		
		clientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client c) {
		
		clientRepository.save(c);
		return c;
	}

	@Override
	public Client retrieveClient(Long id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id).get();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
