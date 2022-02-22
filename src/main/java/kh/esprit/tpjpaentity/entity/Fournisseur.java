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
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table( name = "Fournisseur")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Fournisseur implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idFournisseur")
	private Long idFournisseur; 
	
	@Column(name="codeFournisseur")
	private String codeFournisseur;
	
	@Column(name="libelleFournisseur")
	private String libelleFournisseur;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Produit> produits;

	
	
}
