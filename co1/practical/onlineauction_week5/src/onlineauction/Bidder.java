package onlineauction;

public class Bidder implements AuctionEvent {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Bidder " + name + " received notification: " + message);
    }
}