package DAOOS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Domain.Book;
import net.codejava.hibernate.BookManager;

public class BookDAOImplementation {

	SessionFactory sessionFactory;
	BookManager manager = new BookManager();
	
	
	public void createBook(Book book) {
		
		sessionFactory = manager.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(book);
		
		session.getTransaction().commit();
		session.close();
		manager.exit();
	}
	
	public Book readBook(String bookTitle) {
		
		return null;
	}
	
	public Book updateBook(String bookTitle) {
		return null;
	}
	
	public boolean deleteBook(String bookTitle) {
		return true;
	}
}
