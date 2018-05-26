package net.codejava.hibernate;

import daoos.BookDAOImplementation;
import domain.Book;

public class AtTheCounter {


	
	public static void main(String[] args) {
		
		BookDAOImplementation bookDAO = new BookDAOImplementation();
		
	//	Book book = new Book("duh", "Jooi Anjas", 15.78f);
	//	System.out.println(book.toString());
		
//CREATE	//	bookDAO.createBook(book);
		
//	System.out.println((bookDAO.readBook(12)).toString());
		
//UPDATE	Book book2 = bookDAO.readBook(5);
		//	book2.setTitle("BestTitleEvar");
		//	System.out.println(bookDAO.updateBook(book2));
		
//DELETE
		Book book3 = bookDAO.readBook(9);
		System.out.println(book3.toString());
		bookDAO.deleteBook(book3);
	}
	
}
