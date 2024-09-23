package com.auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements subject{
	 private List<observer> observers;
	    private String item;

	    public Auction() {
	        observers = new ArrayList<>();
	    }

	    @Override
	    public void registerObserver(observer observer) {
	        observers.add(observer);
	    }

	    @Override
	    public void unregisterObserver(observer observer) {
	        observers.remove(observer);
	    }

	    @Override
	    public void notifyObservers(String event) {
	        for (observer observer : observers) {
	            observer.update(event);
	        }
	    }

	    public void setItem(String item) {
	        this.item = item;
	        notifyObservers("Item Available: " + item);
	    }

	    public void startBidding() {
	        notifyObservers("Bidding Started for: " + item);
	    }

	    public void endBidding() {
	        notifyObservers("Bidding Ended for: " + item);
	    }

}
