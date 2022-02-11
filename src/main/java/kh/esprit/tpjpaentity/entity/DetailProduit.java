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

@Entity
@Table( name = "DetailProduit")
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

	public Long getIdDetailProduit() {
		return idDetailProduit;
	}

	public void setIdDetailProduit(Long idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}

	public Date getDateCration() {
		return dateCration;
	}

	public void setDateCration(Date dateCration) {
		this.dateCration = dateCration;
	}

	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}

	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "DetailProduit [idDetailProduit=" + idDetailProduit + ", dateCration=" + dateCration
				+ ", dateDerniereModification=" + dateDerniereModification + ", categorieProduit=" + categorieProduit
				+ ", produit=" + produit + "]";
	}
	
	
	
	
	

}
