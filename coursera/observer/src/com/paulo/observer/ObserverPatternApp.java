package com.paulo.observer;

public class ObserverPatternApp {

	public static void main(String[] args) {
		Subject blogObservable = new Blog("NewPost", "Blog Car");
		
		Observer user1 = new Subscriber("Paul");
		Observer user2 = new Subscriber("Anna");
		
		blogObservable.registerObserver(user1);
		blogObservable.registerObserver(user2);
		
		blogObservable.notifyObserver();
	}
	
	
}
