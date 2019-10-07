package ca.uwo.csd.cs2212.USERNAME;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {
	@Test
	public void testDebitWithSufficientFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.debit(5); 
		Assert.assertequals(5.0, amount);
	}
	
	@Test
	public void testDebitWithInSufficientFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.debit(11); 
		Assert.assertequals(10.0, amount);
	}	
}