package daoos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Book;

public class GenericDAO<T> {
	
	private final Class<T> clazz = null;
	private T primaryKey;
	
	
	
	public void createObject(T entity) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(entity);
		
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
	}
	
	public T readObject(long id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.clear(); //empties the entitymanager from persistence context
		T entity = entityManager.find(clazz, id);
		
		entityManagerFactory.close();
			
		return entity;
	}
	
	//Overloaded
public T readObject(T entity) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.clear(); //empties the entitymanager from persistence context
	
		//HAVE TO SOLVE THIS
		entity = entityManager.find(clazz, primaryKey);
		
		entityManagerFactory.close();
			
		return entity;
	}
	
	
	public T updateObject(T entity) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//updating the object in the database
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		
		//getting the updated object back from the database 
		entity = readObject(entity);
		
		entityManagerFactory.close();
		
		
		return entity;
	}
	
	public void deleteObject() {
		
	}
	
}
