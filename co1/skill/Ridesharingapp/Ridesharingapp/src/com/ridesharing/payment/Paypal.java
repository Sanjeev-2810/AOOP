package com.ridesharing.payment;

public class Paypal implements PaymentMethod{
	 @Override
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using PayPal.");
	    }

}
