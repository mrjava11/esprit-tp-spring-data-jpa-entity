package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository <Client , Long> {

	
	
	
	
	
}
