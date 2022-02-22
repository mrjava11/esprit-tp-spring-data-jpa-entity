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

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table( name = "Rayon")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
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

	
	
}
