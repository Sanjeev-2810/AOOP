package onlineauction;

import java.util.ArrayList;
import java.util.List;

public class Auction {
    private List<AuctionEvent> bidders = new ArrayList<>();
    private String auctionItem;

    public void addBidder(AuctionEvent bidder) {
        bidders.add(bidder);
    }

    public void removeBidder(AuctionEvent bidder) {
        bidders.remove(bidder);
    }

    public void notifyBidders(String message) {
        for (AuctionEvent bidder : bidders) {
            bidder.update(message);
        }
    }

    public void startAuction(String auctionItem) {
        this.auctionItem = auctionItem;
        notifyBidders("Auction started for item: " + auctionItem);
    }

    public void endAuction() {
        notifyBidders("Auction ended for item: " + auctionItem);
    }
}
