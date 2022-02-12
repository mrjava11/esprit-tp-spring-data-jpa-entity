package kh.esprit.tpjpaentity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kh.esprit.tpjpaentity.entity.Stock;

@Repository
public interface StockRepository extends CrudRepository <Stock , Long> {

}
