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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import kh.esprit.tpjpaentity.enums.CategorieClient;
import kh.esprit.tpjpaentity.enums.Profession;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;

@Entity
@Table( name = "Client")
@Data @AllArgsConstructor 
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Client implements Serializable {
	
			@Id
			@GeneratedValue (strategy = GenerationType.IDENTITY)
			@Column(name="idClient")
			private Long idClient; 
			
			@Column(name="nom")
			private String nom;
			
			@Column(name="prenom")
			private String prenom;
			
			@Column(name="email")
			private String email;
			
			@Column(name="password")
			private String password;
			
			@Column(name="dateNaissance")
			@Temporal(TemporalType.DATE)
			private Date dateNaissance;
			
			@Enumerated(EnumType.STRING)
			private Profession profession;
			
			@Enumerated(EnumType.STRING)
			private CategorieClient categorieClient;
			
			
			@OneToMany(cascade = CascadeType.ALL, mappedBy="client_facture")
			private Set<Facture> factures;


			public Client() {
				super();
			}


			


}
