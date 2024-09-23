package com.ridesharing.payment;

public class PaypalFactory implements PaymentFactory{
	   @Override
	    public PaymentMethod createPaymentMethod() {
	        return new Paypal();
	    }

}
