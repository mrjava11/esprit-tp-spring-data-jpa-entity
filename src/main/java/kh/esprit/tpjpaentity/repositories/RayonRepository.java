package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.Rayon;

@Repository
public interface RayonRepository  extends CrudRepository <Rayon , Long> {

}
