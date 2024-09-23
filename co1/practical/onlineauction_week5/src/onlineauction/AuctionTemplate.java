package onlineauction;

public abstract class AuctionTemplate {
	public final void conductAuction(String auctionItem) {
        notifyItemAvailable(auctionItem);
        startBidding();
        processBids();
        endBidding();
    }

    protected abstract void notifyItemAvailable(String auctionItem);
    protected abstract void startBidding();
    protected abstract void processBids();
    protected abstract void endBidding();
}

