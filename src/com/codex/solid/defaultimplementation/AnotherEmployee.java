package com.codex.solid.defaultimplementation;

public class AnotherEmployee implements Payable {
	private Payable delegate = new Payable.Implementation();

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		delegate.pay();
	}

}
