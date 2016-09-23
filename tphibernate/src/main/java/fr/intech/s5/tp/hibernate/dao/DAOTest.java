package fr.intech.s5.tp.hibernate.dao;

import static org.junit.Assert.*;

import org.junit.*;
import fr.intech.s5.tp.hibernate.entity.*;

public class DAOTest {

	DAO dao;
	
	@Before
	public void setUp(){
		dao = new DAO();
	}
	
	@After
	public void tearDown(){
		dao.close();
	}
	
	@Test
	public void testClient(){
		Client client = new Client();
		
		client.setNom("Martin");
		client.setPrenom("Mickael");
		client.setAdresse("11 rue de la Fayette Paris");
		client.setCodePostal(75002);
		client.setPassword("password");
		client.setVille("Paris");
		client.setEmail("m.martin@gmail.com");
		
		Long idClient = dao.ajout(client);
		Client client1 = dao.getClient(idClient);
		
		assertNotNull(idClient);
		assertTrue(idClient > 0);
		assertEquals("Martin", client1.getNom());
		assertEquals("Mickael", client1.getPrenom());
		assertEquals("11 rue de la Fayette Paris", client1.getAdresse());
		assertEquals(75002, client1.getVille());
		assertEquals("password", client1.getPassword());
		assertEquals("Paris", client1.getVille());
		assertEquals("m.martin@gmail.com", client1.getEmail());
	}
	
	@Test
	public void testCompte() {
		
		Client client = new Client();
		
		client.setNom("Martin");
		client.setPrenom("Mickael");
		client.setAdresse("11 rue de la Fayette Paris");
		client.setCodePostal(75002);
		client.setPassword("password");
		client.setVille("Paris");
		client.setEmail("m.martin@gmail.com");
		
		Long idClient = dao.ajout(client);
		
		Compte compte = new Compte();
		
		compte.setClient(client);
		compte.setNumeroCompte(123456);
		compte.setSolde(10000);
		
		Long numeroCompte = dao.ajout(compte);
		Compte compte1 = dao.getCompte(numeroCompte);
		
		assertEquals("Martin", compte1.getClient().getNom());
		assertEquals(10000, compte1.getSolde());
	}
}