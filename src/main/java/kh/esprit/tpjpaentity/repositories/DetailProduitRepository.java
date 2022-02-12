package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.DetailProduit;

@Repository
public interface DetailProduitRepository extends CrudRepository <DetailProduit , Long> {

}
