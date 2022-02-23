package kh.esprit.tpjpaentity.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.Client;
import kh.esprit.tpjpaentity.enums.CategorieClient;
import kh.esprit.tpjpaentity.enums.Profession;

@Repository
public interface ClientRepository extends CrudRepository <Client , Long> {
	
	
//	@Query(value = " SELECT * FROM T_Client c WHERE c.dateNaissance between '01/01/1995' and '31/12/1995' " ,nativeQuery = true)
//	List<Client> findAllClientsByDateNaissance();
		
		
	@Query("SELECT c FROM Client c WHERE c.dateNaissance between '01/01/1995' and '31/12/1995' ")
	List<Client> findAllClientsByDateNaissance();
	
	

//	@Query(value = "SELECT * FROM T_Client c WHERE c.profession= :profession" ,nativeQuery = true)
//	List<Client> retrieveClientsByProfession(@Param("profession") Profession profession);	
	
	@Query("SELECT c FROM Client c WHERE c.profession= :profession")
	List<Client> retrieveClientsByProfession(@Param("profession") Profession profession);
	
	
	@Modifying
	@Query("UPDATE Client c set c.categorieClient = :categorie where c.profession = :profession ")
	int updateClientCategorieByProfession(@Param("categorie") CategorieClient categorieClient, 
								          @Param("profession") Profession profession);	
			
	
	@Modifying
	@Query(" DELETE FROM Client c WHERE c.categorieClient= :categorie AND c.profession = :profession ")
	int deleteClientByCategorieClientAndProfession(@Param("categorie")CategorieClient categorieClient,
												   @Param("profession") Profession profession);
	
	
	@Modifying
	@Query(value = "INSERT INTO Client (nom, prenom,dateNaissance,email,password,profession,categorieClient) VALUES "
			+ "(:nom,:prenom, :dateN, :email, :password, :profession, :categorieClient)",nativeQuery = true)
	void insertClient(@Param("nom") String nom, @Param("prenom") String prenom,
			@Param("dateN") Date dateNaissance, @Param("email") String email,
			@Param("password") String password, @Param("profession") Profession
			profession, @Param("categorieClient") CategorieClient categorieClient);
	
	
	
	
	
	
			
	
	
	
}
