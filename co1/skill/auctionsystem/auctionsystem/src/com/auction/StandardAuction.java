package com.auction;

public class StandardAuction extends Auctiontemplate{
	 @Override
	    protected void startAuction() {
	        System.out.println("Starting Standard Auction...");
	    }

	    @Override
	    protected void placeBids() {
	        System.out.println("Placing bids in Standard Auction...");
	    }

	    @Override
	    protected void endAuction() {
	        System.out.println("Ending Standard Auction...");
	    }

}
