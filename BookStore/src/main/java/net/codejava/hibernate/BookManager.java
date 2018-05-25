package net.codejava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {

	protected SessionFactory sessionFactory;
	
		
	protected void setUp() {
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()	//configures settings from hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch	(Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
		
	}
	
	protected void exit() {
		sessionFactory.close();
	}
	
	protected void create() {
		Book book = new Book();
		book.setTitle("Master of the Universe");
		book.setAuthor("Timotheo Klokeo");
		book.setPrice(103.45f);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(book);
		
		session.getTransaction().commit();
		session.close();
	}
	
	protected void read() {
		
	}
	
	protected void update() {
		
	}
	
	protected void delete() {
		
	}
	
	
	public static void main(String[] args) {
		BookManager manager = new BookManager();
		manager.setUp();
		manager.create();
		manager.exit();

	}

}
