package net.codejava.hibernate;

import daoos.*;
import daoos.BookDAOImplementation;
import daoos.PersonDAOImplementation;
import domain.Account;
import domain.Account.TypeOfAccount;
import domain.Book;
import domain.Dog;
import domain.Person;

public class AtTheCounter {
	
//	private static final Class<?> Book = null;

	public static void main(String[] args) {

		/*WHEN USING THE GENERIC DAO IN CASE OF CREATING AN OBJECT THAT CONTAINS OTHER OBJECTS:
		 * like in this case creating a person with an account object: "Persist is intended for brand 
		 * new transient objects and it fails if the id is already assigned. 
		 * You should call 'update' instead of 'create'.
		 */
		
		Dog dog = new Dog();
		dog.setName("HondjeWafoeii");	
		GenericDAO<Dog> genDAO2 = new GenericDAO<Dog>();
		genDAO2.createObject(dog);
		
		Account account = new Account();
		Class c = account.getClass();
		GenericDAO<Account> genDAO = new GenericDAO<Account>(c);
		Account account2 = genDAO.readObject(1);
		System.out.println(account2.toString());
		
		Person person = new Person("Arie", "Boersma", account2, dog);
		GenericDAO<Person> genDAO3 = new GenericDAO<Person>();
		genDAO3.updateObject(person);
		
		
/*	With the specified DAO's it does work to use create though:	
		AccountDAOImplementation accountDAO = new AccountDAOImplementation();
		Account account = accountDAO.readAccount(2);
		
		Person person = new Person("Arie", "Boersma", account);
		PersonDAOImplementation personDAO = new PersonDAOImplementation();
		personDAO.createPerson(person);
*/		
	}
	
	
}
