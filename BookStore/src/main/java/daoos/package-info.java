/**	TESTING GENERIC DAO'S
//DELETE	//	Book book = new Book();
			//	Class c = book.getClass();
		
			//	GenericDAO<Book> genDAO = new GenericDAO<Book>(c);
			//	genDAO.deleteObject(7);	
		
//UPDATE	Works only with all fields given
			//	Book book = new Book(12);
			//	book.setTitle("Nieuwe Tietel");
			//	book.setAuthor("autoor");
			//	book.setPrice(123);
		
			//	GenericDAO<Book> genDAO = new GenericDAO<Book>();
			//	genDAO.updateObject(book);
		
		
//READ		//	Book book = new Book();
			//	Class c = book.getClass();	
			//	GenericDAO<Book> genDAO = new GenericDAO<Book>(c);
			//	System.out.println((genDAO.readObject(5)).toString());
		
			

//CREATE	//	GenericDAO<Book> genDAO = new GenericDAO<Book>(c);
			//	genDAO.createObject(book);
 * */
 /*
 * Old testing code: testing the Book CRUD methods
 * 		
//		BookDAOImplementation bookDAO = new BookDAOImplementation();
		
//		Book book = new Book("hero", "Johu hipster", 19.78f);
//		System.out.println(book.toString());
		
//CREATE	//	bookDAO.createBook(book);
		
//READ		//	System.out.println((bookDAO.readBook(12)).toString());
		
//UPDATE		Book book2 = bookDAO.readBook(5);
			//	book2.setTitle("BestTitleEvar");
			//	System.out.println(bookDAO.updateBook(book2));
		
//DELETE
			//	Book book3 = bookDAO.readBook(9);
			//	System.out.println(book3.toString());
			//	bookDAO.deleteBook(book3);

//		BookDAOImplementation bookDAO = new BookDAOImplementation();
		
//		Book book2 = bookDAO.readBook(11);
//		book2.setTitle("BestTitleEyvaaar");
//		System.out.println(bookDAO.updateBook(book2));
		
		
	//	Book book = new Book("Wat 9179 titel", "Goedte Schrijvor", 19.67f);
	//	bookDAO.createBook(book);

	//	System.out.println(bookDAO.readBook(1));
		
	//	bookDAO.deleteBook(17);
		
	/*	AccountDAOImplementation accountDAO = new AccountDAOImplementation();
		PersonDAOImplementation personDAO = new PersonDAOImplementation();
		
		Account account = new Account(TypeOfAccount.EMPLOYEE, "tuew@mail.com", "weightword");
		Person person = new Person("Karel", "Jong", account);
		
		
		accountDAO.createAccount(account);
		personDAO.createPerson(person);
	*/	

 
/**
 * @author evavangeenen
 *
 */
package daoos;