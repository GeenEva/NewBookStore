package daoos;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class GenericDAO<T> {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private Class<T> clazz = null;
	
	public GenericDAO() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		this.entityManager = entityManagerFactory.createEntityManager();
	}
	
	public GenericDAO(Class<T> classToSet){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		this.entityManager = entityManagerFactory.createEntityManager();
		this.clazz = classToSet;
	}
	
	
	public void createObject(T entity) {
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(entity);
		
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
	}
	
	public T readObject(Class<?> type, long id) {
		
		entityManager.clear(); //empties the entitymanager from persistence context
		T entity = entityManager.find(clazz, id);
		
		System.out.println((entityManager.find(type.getClass(), id)).toString());
		
		entityManagerFactory.close();
			
		return entity;
	}
	
	
	public void updateObject(T entity) {
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		
		
		entityManagerFactory.close();
		
	}
	
	
	public void deleteObject(long id) {
			
			entityManager.getTransaction().begin();
			entityManager.clear();
			
			T entity2 = entityManager.find(clazz, id);
			entityManager.remove(entity2);
			
			entityManager.getTransaction().commit();
			entityManagerFactory.close();
			
			System.out.println("Object has been deleted... at least in the database...");
		
	}
	
}
