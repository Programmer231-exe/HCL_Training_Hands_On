package com.minitransaction.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.minitransaction.bank.BankAccountManager;

class BankAccountManagerSpec {

	
	@Test
	void is_Valid_User() {
		assertNotNull(BankAccountManager.getBankAccounts("Sivasankar"));
	}
	
	@Test
	void is_Not_Valid_User() {
		assertNull(BankAccountManager.getBankAccounts("xxxxxxxxxxx"));
	}
	

}
