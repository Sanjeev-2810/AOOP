package com.ridesharing.payment;

public class Creditcard implements PaymentMethod{
	@Override
	 public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
	

}
