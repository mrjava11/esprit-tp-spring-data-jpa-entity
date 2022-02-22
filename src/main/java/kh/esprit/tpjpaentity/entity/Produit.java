package kh.esprit.tpjpaentity.entity;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;




@Entity
@Table( name = "Produit")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
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

	
	
	
	
}
