package daoos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Account;
import domain.Person;
import net.codejava.hibernate.SessionFactoryClass;

public class PersonDAOImplementation {

	SessionFactoryClass sessionFactoryClass = new SessionFactoryClass();
	
	public void createPerson(Person person) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(person);
		
		session.getTransaction().commit();
		session.close();
		sessionFactoryClass.exit();
	}
}
