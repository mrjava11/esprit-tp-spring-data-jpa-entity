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
@Table( name = "Rayon")
public class Rayon implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idRayon")
	private Long idRayon; 
	
	@Column(name="codeRayon")
	private String codeRayon;
	
	@Column(name="libelleRayon")
	private String libelleRayon;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="rayon")
	private Set<Produit> produits_rayon;

	public Long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
	}

	public String getCodeRayon() {
		return codeRayon;
	}

	public void setCodeRayon(String codeRayon) {
		this.codeRayon = codeRayon;
	}

	public String getLibelleRayon() {
		return libelleRayon;
	}

	public void setLibelleRayon(String libelleRayon) {
		this.libelleRayon = libelleRayon;
	}

	public Set<Produit> getProduits_rayon() {
		return produits_rayon;
	}

	public void setProduits_rayon(Set<Produit> produits_rayon) {
		this.produits_rayon = produits_rayon;
	}

	@Override
	public String toString() {
		return "Rayon [idRayon=" + idRayon + ", codeRayon=" + codeRayon + ", libelleRayon=" + libelleRayon
				+ ", produits_rayon=" + produits_rayon + "]";
	}
	
	
	
	
	
	
}
