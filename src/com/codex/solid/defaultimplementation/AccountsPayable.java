package com.codex.solid.defaultimplementation;

public class AccountsPayable {
	private static AccountsPayable accountsPayable = new AccountsPayable();

	static AccountsPayable getInstance() {
		return accountsPayable;
	}

	public void paying(Payable payable) {
		payable.pay();
	}
}
