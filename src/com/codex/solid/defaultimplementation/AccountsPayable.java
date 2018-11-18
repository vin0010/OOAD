package com.codex.solid.defaultimplementation;

public class AccountsPayable implements AccountsPayableInterface {
	private static AccountsPayable accountsPayable = new AccountsPayable();

	public static AccountsPayable getInstance() {
		return accountsPayable;
	}

	@Override
	public void paying(Payable payable) {
		payable.pay();
	}
}
