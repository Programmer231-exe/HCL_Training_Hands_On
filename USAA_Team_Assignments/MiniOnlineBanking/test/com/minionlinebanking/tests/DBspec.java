package com.minionlinebanking.tests;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.onlinetransactiondemo.dba.DBConnectors;

class DBspec {

	
	@Test
	@DisplayName("Database Connectio ")
	void dbConnection_successful() {
		Locale locale = new Locale("db","MS");
		assertTrue("Database Connection failure",DBConnectors.getConnection("database",locale));
	}
	
	void dbConnection_failure() {
		Locale locale = new Locale("db","OD");
		assertFalse("Database connection Passed unexpectedly",DBConnectors.getConnection("database",locale));
	}

}
