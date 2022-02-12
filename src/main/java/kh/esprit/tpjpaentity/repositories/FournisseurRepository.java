package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.Fournisseur;


@Repository
public interface FournisseurRepository extends CrudRepository <Fournisseur , Long> {

}
