package kh.esprit.tpjpaentity.services.Interfaces;

import java.util.List;

import kh.esprit.tpjpaentity.entity.Produit;

public interface IProduitService {
	List<Produit> retrieveAllProduits();

	boolean addProduit(Produit p, Long idRayon, Long idStock);

	Produit retrieveProduit(Long id);

}
