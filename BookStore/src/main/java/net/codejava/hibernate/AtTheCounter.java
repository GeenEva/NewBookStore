package net.codejava.hibernate;

import daoos.AccountDAOImplementation;
import domain.Account;
import domain.Account.TypeOfAccount;

public class AtTheCounter {


	
	public static void main(String[] args) {

		AccountDAOImplementation accountDAO = new AccountDAOImplementation();
		
		Account account = new Account(TypeOfAccount.DEFAULT, "miAUuuuw@mail.com", "weightword");
		
		
		
		accountDAO.createAccount(account);
		
	}
	
}
