package daoos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Domain.Book;
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
