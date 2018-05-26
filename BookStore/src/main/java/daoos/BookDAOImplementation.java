package daoos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Book;
import net.codejava.hibernate.BookManager;

public class BookDAOImplementation {

	BookManager bookManager = new BookManager();
	
	
	public void createBook(Book book) {
		
		SessionFactory sessionFactory = bookManager.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(book);
		
		session.getTransaction().commit();
		session.close();
		bookManager.exit();
	}
	
	public Book readBook(long id) {
		SessionFactory sessionFactory = bookManager.setUp();
		Session session = sessionFactory.openSession();
		
		Book book = session.get(Book.class, id);
		bookManager.exit();
			
		return book;
	}
	
	public Book updateBook(Book book) {
		
		SessionFactory sessionFactory = bookManager.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//updating the book in the database
		session.update(book);
		session.getTransaction().commit();
		
		//getting the updated book back from the database
		book = readBook(book.getId());
		
		session.close();
		bookManager.exit();
		
		return book;
	}
	
	public void deleteBook(Book book) {
		
		SessionFactory sessionFactory = bookManager.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.delete(book);
		
		session.getTransaction().commit();
		session.close();
		
		bookManager.exit();
		
		System.out.println("Book has been deleted... at least in the database...");
	}
}
