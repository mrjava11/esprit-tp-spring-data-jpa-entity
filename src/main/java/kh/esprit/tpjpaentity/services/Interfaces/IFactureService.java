package kh.esprit.tpjpaentity.services.Interfaces;


import java.util.List;

import kh.esprit.tpjpaentity.entity.Facture;


public interface IFactureService {
	List<Facture> retrieveAllFactures();
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);

}
