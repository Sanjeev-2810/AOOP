package com.auction;

public class ReserveAuction extends Auctiontemplate{
	@Override
    protected void startAuction() {
        System.out.println("Starting Reserve Auction...");
    }

    @Override
    protected void placeBids() {
        System.out.println("Placing bids with reserve in Reserve Auction...");
    }

    @Override
    protected void endAuction() {
        System.out.println("Ending Reserve Auction...");
    }

}
