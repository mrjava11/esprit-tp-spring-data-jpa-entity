package kh.esprit.tpjpaentity.services.Interfaces;

import java.util.List;
		
import kh.esprit.tpjpaentity.entity.Stock;


public interface IStockService {
	
	List<Stock> retrieveAllStocks();
	boolean addStock(Stock s);
	Stock updateStock(Stock u);
	Stock retrieveStock(Long id);

}
