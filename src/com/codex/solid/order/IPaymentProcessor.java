package com.codex.solid.order;

public interface IPaymentProcessor {
	public void pay(IPaymentDetails details);
}
