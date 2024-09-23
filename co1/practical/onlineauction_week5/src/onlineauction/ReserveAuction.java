package onlineauction;

public class ReserveAuction extends AuctionTemplate {
    @Override
    protected void notifyItemAvailable(String auctionItem) {
        System.out.println("Reserve Auction: Item available - " + auctionItem);
    }

    @Override
    protected void startBidding() {
        System.out.println("Reserve Auction: Bidding started with reserve price.");
    }

    @Override
    protected void processBids() {
        System.out.println("Reserve Auction: Processing bids with reserve price.");
    }

    @Override
    protected void endBidding() {
        System.out.println("Reserve Auction: Bidding ended with reserve price check.");
    }
}
