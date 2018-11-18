package com.codex.solid.defaultimplementation;

public interface Payable {
	public void pay();

	static class Implementation implements Payable {
		private AccountsPayableInterface accountsPayableInterface;

		public void addAccountsPayableInterface(AccountsPayableInterface accountsPayableInterface) {
			this.accountsPayableInterface = accountsPayableInterface;
		}

		public void pay() {
			// For ball socket notation add
//			AccountsPayable.getInstance().paying(this);
			accountsPayableInterface.paying(this);
			System.out.println("Pay is called!");
		}
	}

}
