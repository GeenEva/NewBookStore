package daoos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Account;
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
	
	
	public Account readAccount() {
		return null;
	}
	
	
	public Account updateAccount() {
		return null;
	}
	
	
	public void deleteAccount() {
		
	}
	
}
