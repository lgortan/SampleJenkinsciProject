package com.adeccotraining.jenkinscisample1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adeccotraining.jenkinscisample1.BankAccount;

public class TestBankAccount {
			@Test
		public void testDebit() {
			BankAccount ac = new BankAccount(10.0);
			assertEquals("If I debit 5 in a BankAccount of 10 all 5 are debited", ac.debit(5), 5.0, 0);
		}

}
