package kh.esprit.tpjpaentity.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table( name = "Facture")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Facture implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idFacture")
	private Long idFacture; 
	
	@Column(name="montantRemise")
	private float montantRemise;
	
	@Column(name="montantFacture")
	private float montantFacture;
	
	@Column(name="dateFacture")
	@Temporal (TemporalType.DATE)
	private Date dateFacture;
	
	@Column(name="active")
	private boolean active;
	
	
	@ManyToOne
	private Client client_facture;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
	private Set<DetailFacture> detailFactures;

	

}
