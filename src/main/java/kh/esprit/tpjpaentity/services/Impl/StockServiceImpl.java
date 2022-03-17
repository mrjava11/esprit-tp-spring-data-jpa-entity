package kh.esprit.tpjpaentity.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import kh.esprit.tpjpaentity.entity.Client;
import kh.esprit.tpjpaentity.entity.Stock;
import kh.esprit.tpjpaentity.repositories.StockRepository;
import kh.esprit.tpjpaentity.services.Interfaces.IStockService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StockServiceImpl implements IStockService{
	
	@Autowired
	 private StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		List<Stock> list = new ArrayList<>();
		stockRepository.findAll().forEach(e -> list.add(e));
		for(Stock stock : list) {
			log.info("Stock: "+stock);
		}
		
		return list;
	}

	@Override
	public  synchronized boolean addStock(Stock s) {
		List<Client> list = stockRepository.retrieveStock(s.getIdStock()); 	
        if (list.size() > 0) {
           return false;
        } else {
        	stockRepository.save(s);
        return true;
}
	}

	@Override
	public Stock updateStock(Stock u) {
		return stockRepository.save(u);
	}

	@Override
	public Stock retrieveStock(Long id) {
		Stock obj = stockRepository.findById(id).get();
		return obj;
	}
	
	
	
//	@Scheduled(fixedDelay = 60000)
//	public void StatusStock() {
//	
//		for(Stock verif_stock:retrieveAllStocks()){
//				
//				if (verif_stock.getQteStock() == 0) 
//				{
//					System.out.println("Repture de stock");
//				}
//				else 
//				{
//					System.out.println("stockQte : " + verif_stock.getQteStock() );
//				}
//		
//		}
//	}
	
		
		
	
}
