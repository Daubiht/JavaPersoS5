package fr.intech.s5.tp.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "Client", 
		uniqueConstraints={
				@UniqueConstraint(name="nom_prenom", columnNames={"nom","nbrLigneTot"})
})

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	@Column( name = "NOM", nullable = false, length = 255 )
	private String nom;
	
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
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

	@Column( name = "PRENOM", nullable = false, length = 255 )
	private String prenom;
	
	@Column( name = "ADRESSE", nullable = false, length = 255 )
	private String adresse;
	
	@Column( name = "CP", nullable = false, length = 5 )
	private int codePostal;
	
	@Column( name = "VILLE", nullable = false, length = 50 )
	private String ville;
	
	@Column( name = "EMAIL", nullable = false, length = 255 )
	private String email;
	
	@Column( name = "PASSWORD", nullable = false, length = 255 )
	private String password;
	
	
}