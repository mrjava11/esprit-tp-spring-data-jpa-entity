package kh.esprit.tpjpaentity.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.Client;
import kh.esprit.tpjpaentity.entity.Produit;

@Repository
public interface ProduitRepository extends CrudRepository <Produit , Long> {

	@Query("SELECT p FROM Produit p WHERE p.idProduit= :idProduit")
	List<Client> retrieveProduit(@Param("idProduit") Long idProduit);

}
