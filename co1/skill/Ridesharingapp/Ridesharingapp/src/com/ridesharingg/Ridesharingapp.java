package com.ridesharingg;

import com.ridesharing.auth.Userauth;
import com.ridesharing.payment.*;
import com.ridesharing.vehicle.*;

public class Ridesharingapp {
	public static void main(String[] args) {
      
        Userauth auth = Userauth.getInstance();
        auth.login("sam");

      
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.createVehicle("car");
        vehicle.drive();

        PaymentFactory paymentFactory = new CreditcardFactory();
        PaymentMethod payment = paymentFactory.createPaymentMethod();
        payment.pay(50.0);

        auth.logout();
    }

}
