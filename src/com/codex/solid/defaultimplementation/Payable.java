package com.codex.solid.defaultimplementation;

public interface Payable {
	public void pay();

	static class Implementation implements Payable{
		public void pay() {
			//For ball socket notation add
			AccountsPayable.getInstance().paying(this);
			System.out.println("Pay is called!");
		}
	}
	
	
}
