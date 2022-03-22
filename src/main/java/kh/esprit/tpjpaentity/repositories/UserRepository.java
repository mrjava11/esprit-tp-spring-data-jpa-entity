package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import kh.esprit.tpjpaentity.entity.User;

@Repository
public interface UserRepository extends CrudRepository <User , Long> {
	 
		User findByUserName(String userName);
}
