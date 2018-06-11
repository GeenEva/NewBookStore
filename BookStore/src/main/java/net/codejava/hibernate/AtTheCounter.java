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

	Account account = new Account(TypeOfAccount.CUSTOMER, "mailmail", "wachwach")	;
	Person person = new Person("karel", "deboer", account);
	PersonDAOImplementation personDAO = new PersonDAOImplementation();
	personDAO.createPerson(person);
	}
	
	
}
