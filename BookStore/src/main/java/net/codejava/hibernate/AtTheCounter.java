package net.codejava.hibernate;

import Domain.Book;
import daoos.BookDAOImplementation;

public class AtTheCounter {


	
	public static void main(String[] args) {
		
		BookDAOImplementation bookDAO = new BookDAOImplementation();
		
		Book book = new Book("shikoka", "Jooi Anjas", 15.78f);
		System.out.println(book.toString());
		bookDAO.createBook(book);
		

	}
	
}
