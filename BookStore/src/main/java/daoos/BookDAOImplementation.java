package daoos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Book;
import net.codejava.hibernate.SessionFactoryClass;

public class BookDAOImplementation {

	SessionFactoryClass sessionFactoryClass = new SessionFactoryClass();
	
	
	public void createBook(Book book) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(book);
		
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
		
	}
	
	public Book readBook(long id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.clear(); //empties the entitymanager from persistence context
		Book book = entityManager.find(Book.class, id);
		
		entityManagerFactory.close();
			
		return book;
	}
	
	public Book updateBook(Book book) {
		
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//updating the book in the database
		session.update(book);
		session.getTransaction().commit();
		
		//getting the updated book back from the database
		book = readBook(book.getId());
		
		session.close();
		sessionFactoryClass.exit();
		
		return book;
	}
	
	public void deleteBook(long id ) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStore");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.clear();
		
		Book book = entityManager.find(Book.class, id);
		entityManager.remove(book);
		
		entityManager.getTransaction().commit();
		entityManagerFactory.close();
		
		System.out.println("Book has been deleted... at least in the database...");
	}
}
