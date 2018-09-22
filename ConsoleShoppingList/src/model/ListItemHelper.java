package model;

import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

// ConsoleShoppingList project by Oscar Antonio Parra Perez
// ListItemHelper class

public class ListItemHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ConsoleShoppingList");
			
	public void insertItem(ListItem li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close()
;	}
	
	
	
}
