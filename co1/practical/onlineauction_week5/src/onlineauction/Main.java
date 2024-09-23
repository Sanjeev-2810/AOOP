package onlineauction;

public class Main {

	public static void main(String[] args) {
        Auction auction = new Auction();
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        auction.addBidder(bidder1);
        auction.addBidder(bidder2);

        auction.startAuction("Laptop");
        auction.endAuction();

        System.out.println();

        AuctionTemplate standardAuction = new StandardAuction();
        standardAuction.conductAuction("Smartphone");

        System.out.println();

        AuctionTemplate reserveAuction = new ReserveAuction();
        reserveAuction.conductAuction("Antique Vase");
    }
}
