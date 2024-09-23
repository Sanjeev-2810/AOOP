package com.auction;

public interface subject {
	void registerObserver(observer observer);
    void unregisterObserver(observer observer);
    void notifyObservers(String event);
}
