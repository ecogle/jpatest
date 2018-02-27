package com.eco.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_database");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Person p = new Person();
		
		p.setAge(34);
		p.setFirstName("Chad");
		p.setLastName("Ogle");
		p.setEmail("ecogle@gmail.com");
		p.setMiddleInit("E");
		
		em.persist(p);
		
		em.getTransaction().commit();
	}

}
