package com.codex.solid.defaultimplementation;

public interface Payable {
	public void pay();

	static class Implementation implements Payable{
		public void pay() {
			System.out.println("Pay is called!");
		}
	}
	
	
}
