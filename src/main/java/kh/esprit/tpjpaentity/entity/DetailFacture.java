package kh.esprit.tpjpaentity.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table( name = "DetailFacture")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
public class DetailFacture implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailFacture")
	private Long idDetailFacture; 
	
	@Column(name="qte")
	private int qte;
	
	@Column(name="prixTotal")
	private float prixTotal;
	
	@Column(name="pourcentageRemise")
	private int pourcentageRemise;
	
	@Column(name="montantRemise")
	private int montantRemise;
	
	@ManyToOne
	private Produit produit_detail_fac;
	
	@ManyToOne
	private Facture facture;

	

	
	

	

	

	
	
	

}
