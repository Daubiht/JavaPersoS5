package fr.intech.s5.tp.hibernate.entity;

import javax.persistence.*;


@Entity
@Table(name = "Compte")

public class Compte {

	@Id
	@Column( name = "numero_compte")
	private long numeroCompte;
	
	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public long getSolde() {
		return solde;
	}

	public void setSolde(long solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column( name = "SOLDE")
	private long solde;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_client")
	private Client client;
	
	public long getNumberCompter(){
		return numeroCompte;
	}
}