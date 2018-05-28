package daoos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import evenuitproberen.Book;
import net.codejava.hibernate.SessionFactoryClass;

public class BookDAOImplementation {

	SessionFactoryClass sessionFactoryClass = new SessionFactoryClass();
	
	
	public void createBook(Book book) {
		
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(book);
		
		session.getTransaction().commit();
		session.close();
		sessionFactoryClass.exit();
	}
	
	public Book readBook(long id) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		
		Book book = session.get(Book.class, id);
		sessionFactoryClass.exit();
			
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
	
	public void deleteBook(Book book) {
		
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.delete(book);
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactoryClass.exit();
		
		System.out.println("Book has been deleted... at least in the database...");
	}
}
