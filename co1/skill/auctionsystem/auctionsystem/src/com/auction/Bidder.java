package com.auction;

public class Bidder implements observer{
	private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received update: " + event);
    }

}
