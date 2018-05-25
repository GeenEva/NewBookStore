package Domain;

import DAOOS.BookDAOImplementation;

public class AtTheCounter {


	
	public static void main(String[] args) {
		
		BookDAOImplementation bookDAO = new BookDAOImplementation();
		
		Book book = new Book("hihihi", "Jo Anja", 5.78f);
		System.out.println(book.toString());
		bookDAO.createBook(book);
		

	}
	
}
