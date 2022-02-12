package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.Facture;

@Repository
public interface FactureRepository extends CrudRepository <Facture , Long> {

}
