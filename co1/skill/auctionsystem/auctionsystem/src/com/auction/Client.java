package com.auction;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auction auction = new Auction();

        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);

        auction.setItem("Antique Vase");
        auction.startBidding();
        auction.endBidding();

        Auctiontemplate standardAuction = new StandardAuction();
        Auctiontemplate reserveAuction = new ReserveAuction();

        System.out.println("\nRunning Standard Auction:");
        standardAuction.conductAuction();

        System.out.println("\nRunning Reserve Auction:");
        reserveAuction.conductAuction();

	}

}
