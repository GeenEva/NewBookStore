package daoos;

import java.lang.reflect.Executable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class GenericDAO<T> {
	
	private Class<T> clazz = null;
	

	
	
	public void createObject(T entity) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist(entity);
		
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
	}
	
	public T readObject(Class<?> type, long id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.clear(); //empties the entitymanager from persistence context
		entityManager.find(type.getClass(), id);
		
		System.out.println((entityManager.find(type.getClass(), id)).toString());
		
		entityManagerFactory.close();
			
		return null;
	}
	
	
/*	
	
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
	*/
	
	public void deleteObject(T entity) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.clear();
			
			T entity2 = entityManager.find(clazz, entity);
			entityManager.remove(entity2);
			
			entityManager.getTransaction().commit();
			entityManagerFactory.close();
			
			System.out.println("Object has been deleted... at least in the database...");
		
	}
	
}
