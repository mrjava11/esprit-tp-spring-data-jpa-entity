package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.DetailFacture;


@Repository
public interface DetailFactureRepository  extends CrudRepository <DetailFacture , Long> {

}
