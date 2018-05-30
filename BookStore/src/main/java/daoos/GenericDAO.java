package daoos;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class GenericDAO<T> {
	
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;
	private Class<T> clazz = null;
	
	public GenericDAO(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		this.entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void createObject(T entity) {
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(entity);
		
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
	}
	
	public T readObject(Class<?> type, long id) {
		
		entityManager.clear(); //empties the entitymanager from persistence context
		entityManager.find(type.getClass(), id);
		
		System.out.println((entityManager.find(type.getClass(), id)).toString());
		
		entityManagerFactory.close();
			
		return null;
	}
	
	
/*	
	
	public T updateObject(T entity) {
		
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
			
			entityManager.getTransaction().begin();
			entityManager.clear();
			
			T entity2 = entityManager.find(clazz, entity);
			entityManager.remove(entity2);
			
			entityManager.getTransaction().commit();
			entityManagerFactory.close();
			
			System.out.println("Object has been deleted... at least in the database...");
		
	}
	
}
