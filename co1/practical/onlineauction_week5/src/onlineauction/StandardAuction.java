package onlineauction;

public class StandardAuction extends AuctionTemplate {
    @Override
    protected void notifyItemAvailable(String auctionItem) {
        System.out.println("Standard Auction: Item available - " + auctionItem);
    }

    @Override
    protected void startBidding() {
        System.out.println("Standard Auction: Bidding started.");
    }

    @Override
    protected void processBids() {
        System.out.println("Standard Auction: Processing bids.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Standard Auction: Bidding ended.");
    }
}