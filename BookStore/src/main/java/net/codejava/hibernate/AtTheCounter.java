package net.codejava.hibernate;

import daoos.*;
import daoos.BookDAOImplementation;
import daoos.PersonDAOImplementation;
import domain.Account;
import domain.Account.TypeOfAccount;
import domain.Book;
import domain.Person;

public class AtTheCounter {
	
//	private static final Class<?> Book = null;

	public static void main(String[] args) {
		
		
		Book book = new Book();
		
		Class c = book.getClass();
		
		GenericDAO<Book> genDAO = new GenericDAO<Book>(c);
		
		System.out.println((genDAO.readObject(c, 12)).toString());
		
	

	//	genDAO.createObject(book);

	}
	
}
