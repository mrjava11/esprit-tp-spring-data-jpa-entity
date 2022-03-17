package kh.esprit.tpjpaentity.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.esprit.tpjpaentity.entity.Client;
import kh.esprit.tpjpaentity.entity.Produit;
import kh.esprit.tpjpaentity.repositories.ProduitRepository;
import kh.esprit.tpjpaentity.services.Interfaces.IProduitService;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ProduitServiceImpl implements IProduitService {
	
	
	@Autowired
	 private ProduitRepository produitRepository;

	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> list = new ArrayList<>();
		produitRepository.findAll().forEach(e -> list.add(e));
		for(Produit produit : list) {
			log.info("Produit: "+produit);
		}
		
		return list;
	}
	
	
	@Override
	public Produit retrieveProduit(Long id) {
		Produit obj = produitRepository.findById(id).get();
		return obj;
	}

	@Override
	public boolean addProduit(Produit p, Long idRayon, Long idStock) {
		List<Client> list = produitRepository.retrieveProduit(p.getIdProduit()); 	
        if (list.size() > 0) {
           return false;
        } else {
        	produitRepository.save(p);
        return true;
        }
	}

	

}
