package com.codex.solid.order;

public abstract class IOrder {
	// order does checkout cart, pay money and notify customer
	private ICart cart;
	private IPaymentProcessor paymentProcessor;
	private INotificationManager notificationManager;
	private IPaymentDetails paymentDetails;

//	public IOrder(ICart cart, IPaymentProcessor paymentProcessor, INotificationManager notificationManager, IPaymentDetails paymentDetails) {
//		this.cart = cart;
//		this.paymentProcessor = paymentProcessor;
//		this.notificationManager = notificationManager;
//		this.paymentDetails=paymentDetails;
//	}
	
	public IOrder(){
		
	}

	//TODO - Device needs to be here
	public void checkout(IDevice device) {
		paymentProcessor.pay(paymentDetails);
		notificationManager.sendNotification(device);
	}
}
