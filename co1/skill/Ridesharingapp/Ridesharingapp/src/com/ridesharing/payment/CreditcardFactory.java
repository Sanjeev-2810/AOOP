package com.ridesharing.payment;

public class CreditcardFactory implements PaymentFactory{
	  @Override
	    public PaymentMethod createPaymentMethod() {
	        return new Creditcard();
	    }

}
