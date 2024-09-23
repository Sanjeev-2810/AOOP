package com.ridesharing.payment;

public class Gpay implements PaymentMethod{
	 @Override
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using Google Pay.");
	    }

}
