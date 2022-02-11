package kh.esprit.tpjpaentity.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import kh.esprit.tpjpaentity.enums.CategorieClient;
import kh.esprit.tpjpaentity.enums.Profession;


@Entity
@Table( name = "Produit")
public class Produit implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column(name="idProduit")
	private Long idProduit; 
	
	@Column(name="codeProduit")
	private String codeProduit;
	
	@Column(name="libelleProduit")
	private String libelleProduit;
	
	@Column(name="prixUnitaire")
	private float prixUnitaire; 
	
	@ManyToOne
	private Rayon rayon;
	
	@ManyToOne
	private Stock stock;
	
	@OneToOne
	private DetailProduit detailProduit;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="produit_detail_fac")
	private Set<DetailFacture> detailFactures;
	
	@ManyToMany(mappedBy="produits", cascade = CascadeType.ALL)
	private Set<Fournisseur> Fournisseurs;

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getLibelleProduit() {
		return libelleProduit;
	}

	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Rayon getRayon() {
		return rayon;
	}

	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public DetailProduit getDetailProduit() {
		return detailProduit;
	}

	public void setDetailProduit(DetailProduit detailProduit) {
		this.detailProduit = detailProduit;
	}

	public Set<DetailFacture> getDetailFactures() {
		return detailFactures;
	}

	public void setDetailFactures(Set<DetailFacture> detailFactures) {
		this.detailFactures = detailFactures;
	}

	public Set<Fournisseur> getFournisseurs() {
		return Fournisseurs;
	}

	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		Fournisseurs = fournisseurs;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", codeProduit=" + codeProduit + ", libelleProduit=" + libelleProduit
				+ ", prixUnitaire=" + prixUnitaire + ", rayon=" + rayon + ", stock=" + stock + ", detailProduit="
				+ detailProduit + ", detailFactures=" + detailFactures + ", Fournisseurs=" + Fournisseurs + "]";
	}
	
	

	
	
	
	
	
}
