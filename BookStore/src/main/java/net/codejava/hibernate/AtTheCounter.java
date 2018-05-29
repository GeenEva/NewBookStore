package net.codejava.hibernate;

import daoos.*;
import daoos.BookDAOImplementation;
import daoos.PersonDAOImplementation;
import domain.Account;
import domain.Account.TypeOfAccount;
import domain.Book;
import domain.Person;

public class AtTheCounter {
	
	public static void main(String[] args) {
		
		GenericDAO<Book> genDAO = new GenericDAO<Book>();
		
		Book book = new Book("897yui", "Johu hipstero", 19.78f);
		

		genDAO.createObject(book);

	}
	
}
