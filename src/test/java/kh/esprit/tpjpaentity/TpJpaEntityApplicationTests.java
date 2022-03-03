package kh.esprit.tpjpaentity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kh.esprit.tpjpaentity.entity.Stock;
import kh.esprit.tpjpaentity.repositories.StockRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
class TpJpaEntityApplicationTests {

	@Autowired
	StockRepository stockRepository; 
	
	
	@Test
	public void testAddStock() {
		Stock s = new Stock();
		s.setLibelleStock("test ");
		s.setQteStock(10);
		s.setQteMin(100);
		stockRepository.save(s);
	
	}
	
	@Test
	public void testDeleteStock() {
		
		stockRepository.deleteById(1L);
	
	}
	
	

}
