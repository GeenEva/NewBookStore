package daoos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import domain.Account;
import domain.Book;
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
	
	public Person readReadPerson(long id) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		
		Person person = session.get(Person.class, id);
		sessionFactoryClass.exit();
			
		return person;
	}
	
	public Person readPerson(long id) {
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		
		Person person = session.get(Person.class, id);
		sessionFactoryClass.exit();
			
		return person;
	}
	
public void deletePerson(Person person) {
		
		SessionFactory sessionFactory = sessionFactoryClass.setUp();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.delete(person);
		
		session.getTransaction().commit();
		session.close();
		
		sessionFactoryClass.exit();
		
		System.out.println("Person has been deleted... at least in the database...");
	}
}
