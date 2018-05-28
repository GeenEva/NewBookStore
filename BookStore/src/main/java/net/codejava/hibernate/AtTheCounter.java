package net.codejava.hibernate;

import daoos.AccountDAOImp;
import domain.Account;
import domain.Account.TypeOfAccount;

public class AtTheCounter {


	
	public static void main(String[] args) {

		AccountDAOImp accountDAO = new AccountDAOImp();
		
		Account account = new Account(TypeOfAccount.DEFAULT, "miAUw@mail.com", "weightword");
		
		
		
		accountDAO.createAccount(account);
		
	}
	
}
