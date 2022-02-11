package kh.esprit.tpjpaentity.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "Stock")
public class Stock implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idStock")
	private Long idStock; 
	
	@Column(name="qteStock")
	private int qteStock;
	
	@Column(name="qteMin")
	private int qteMin;
	
	@Column(name="libelleStock")
	private String libelleStock;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="stock")
	private Set<Produit> produits_stock;

	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

	public int getQteMin() {
		return qteMin;
	}

	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibelleStock() {
		return libelleStock;
	}

	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}

	public Set<Produit> getProduits_stock() {
		return produits_stock;
	}

	public void setProduits_stock(Set<Produit> produits_stock) {
		this.produits_stock = produits_stock;
	}

	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", qteStock=" + qteStock + ", qteMin=" + qteMin + ", libelleStock="
				+ libelleStock + ", produits_stock=" + produits_stock + "]";
	}

	
	
	
}
