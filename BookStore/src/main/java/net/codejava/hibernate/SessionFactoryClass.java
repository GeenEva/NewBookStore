package net.codejava.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryClass {

	protected SessionFactory sessionFactory;
	
	/*Originally this method in the tutorial had a void return, but since I wanted to call this method
	*now from another class, I had to have an object, so changed the return type to SessionFactory()
	*
	*/
	
	public SessionFactory setUp() {
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()	//configures settings from hibernate.cfg.xml
				.build();
		try {
			return sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch	(Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
			
		}
		return null;
		
	}
	
	public void exit() {
		sessionFactory.close();
	}
	

}
