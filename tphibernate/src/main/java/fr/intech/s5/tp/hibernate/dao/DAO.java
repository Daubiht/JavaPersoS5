package fr.intech.s5.tp.hibernate.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.intech.s5.tp.hibernate.entity.Client;
import fr.intech.s5.tp.hibernate.entity.Compte;

public class DAO {
	SessionFactory sessionFactory;
	
	public DAO() {
		sessionFactory = new Configuration()
				.configure()
				.buildSessionFactory();
	}
	
	public void close () {
		sessionFactory.close();
	}
	
	public <T> Long ajout(T entity) {
		Session session = sessionFactory.openSession();
		
		org.hibernate.Transaction tx = session.beginTransaction();
		Long retour = (Long) session.save(entity);
		tx.commit();
		session.close();
		
		return retour;
	}
	
	public Client getClient(Long idClient) {
		Session session = sessionFactory.openSession();
		
		Client entity = session.get(Client.class, idClient);
		return entity;
	}
	
	public Compte getCompte(Long numeroCompte) {
		Session session = sessionFactory.openSession();
		
		Compte entity = session.get(Compte.class, numeroCompte);
		return entity;
	}
}
