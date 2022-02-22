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
@Table( name = "Stock")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
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

	

	
}
