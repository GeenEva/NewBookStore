package daoos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Account;
import domain.Book;
import net.codejava.hibernate.SessionFactoryClass;

public class AccountDAOImplementation {
	
	SessionFactoryClass sessionFactoryClass = new SessionFactoryClass();
	
	public void createAccount(Account account) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(account);
		
		session.getTransaction().commit();
		session.close();
		sessionFactoryClass.exit();
	}
	
	
	public Account readAccount(long id) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		
		Account account = session.get(Account.class, id);
		sessionFactoryClass.exit();
			
		return account;
	}
	
	
	public Account updateAccount(Account account) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//updating the book in the database
		session.update(account);
		session.getTransaction().commit();
		
		//getting the updated book back from the database
		account = readAccount(account.getId());
		
		session.close();
		sessionFactoryClass.exit();
		
		return account;
	}
	
	
	public void deleteAccount(Account account) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.delete(account);
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactoryClass.exit();
		
		System.out.println("Account has been deleted");
	}
	
}
