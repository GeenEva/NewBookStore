package net.codejava.hibernate;

import daoos.AccountDAOImplementation;
import daoos.BookDAOImplementation;
import daoos.PersonDAOImplementation;
import domain.Account;
import domain.Account.TypeOfAccount;
import domain.Book;
import domain.Person;

public class AtTheCounter {


	
	public static void main(String[] args) {
		
		BookDAOImplementation bookDAO = new BookDAOImplementation();
		Book book = new Book("Wat een goede titel", "Goede Schrijver", 89.67f);
		bookDAO.createBook(book);

	/*	AccountDAOImplementation accountDAO = new AccountDAOImplementation();
		PersonDAOImplementation personDAO = new PersonDAOImplementation();
		
		Account account = new Account(TypeOfAccount.EMPLOYEE, "tuew@mail.com", "weightword");
		Person person = new Person("Karel", "Jong", account);
		
		
		accountDAO.createAccount(account);
		personDAO.createPerson(person);
	*/	
	}
	
}
