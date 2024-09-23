package com.ridesharing.payment;

public class GpayFactory implements PaymentFactory{
	  @Override
	    public PaymentMethod createPaymentMethod() {
	        return new Gpay();
	    }

}
