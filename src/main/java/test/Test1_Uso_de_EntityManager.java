package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1_Uso_de_EntityManager {

	public static void main(String[] args) {
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("Persistencia");	
		EntityManager emanager=emfactory.createEntityManager();
		emanager.close();
		emfactory.close();
	}
}
