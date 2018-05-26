package net.codejava.hibernate;

public class AtTheCounter {


	
	public static void main(String[] args) {
		
		BookDAOImplementation bookDAO = new BookDAOImplementation();
		
		Book book = new Book("dididada", "Joo Anjas", 15.78f);
		System.out.println(book.toString());
		bookDAO.createBook(book);
		

	}
	
}
