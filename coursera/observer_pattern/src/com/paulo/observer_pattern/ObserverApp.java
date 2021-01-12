package com.paulo.observer_pattern;

public class ObserverApp {

	public static void main(String[] args) {
		Observer user1 = new Follower("Paul");
		Observer user2 = new Follower("Anna");
		
		Subject observable = new Channel("Youtube Music");
		
		observable.registerObserver(user1);
		observable.registerObserver(user2);

		observable.notifyObservers("LIVE");
		observable.notifyObservers("OFF");
	}
}
