package com.auction;

public abstract class Auctiontemplate {
	public final void conductAuction() {
        startAuction();
        placeBids();
        endAuction();
    }

    protected abstract void startAuction();
    protected abstract void placeBids();
    protected abstract void endAuction();

}
