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

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;

@Entity
@Table( name = "Client")
///@Data @AllArgsConstructor @NoArgsConstructor @ToString
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


			public Long getIdClient() {
				return idClient;
			}


			public void setIdClient(Long idClient) {
				this.idClient = idClient;
			}


			public String getNom() {
				return nom;
			}


			public void setNom(String nom) {
				this.nom = nom;
			}


			public String getPrenom() {
				return prenom;
			}


			public void setPrenom(String prenom) {
				this.prenom = prenom;
			}


			public String getEmail() {
				return email;
			}


			public void setEmail(String email) {
				this.email = email;
			}


			public String getPassword() {
				return password;
			}


			public void setPassword(String password) {
				this.password = password;
			}


			public Date getDateNaissance() {
				return dateNaissance;
			}


			public void setDateNaissance(Date dateNaissance) {
				this.dateNaissance = dateNaissance;
			}


			public Profession getProfession() {
				return profession;
			}


			public void setProfession(Profession profession) {
				this.profession = profession;
			}


			public CategorieClient getCategorieClient() {
				return categorieClient;
			}


			public void setCategorieClient(CategorieClient categorieClient) {
				this.categorieClient = categorieClient;
			}


			public Set<Facture> getFactures() {
				return factures;
			}


			public void setFactures(Set<Facture> factures) {
				this.factures = factures;
			}


			@Override
			public String toString() {
				return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
						+ ", password=" + password + ", dateNaissance=" + dateNaissance + ", profession=" + profession
						+ ", categorieClient=" + categorieClient + ", factures=" + factures + "]";
			}

			


}
