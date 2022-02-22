package kh.esprit.tpjpaentity.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import kh.esprit.tpjpaentity.enums.CategorieProduit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table( name = "DetailProduit")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
public class DetailProduit implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailProduit")
	private Long idDetailProduit; 
	
	// TIME : 30-09-19 10:50:56.780000000 AM
	// DATE : 30-09-19
	// TIMESTAMP : 1569840656 (nbre de secondes entre 01/01/1970 et la date voulue)
	@Temporal (TemporalType.DATE)
	private Date dateCration;
	
	@Temporal (TemporalType.DATE)
	private Date dateDerniereModification;
	
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	
	@OneToOne(mappedBy="detailProduit")
	private Produit produit;

	
	
	
	
	

}
