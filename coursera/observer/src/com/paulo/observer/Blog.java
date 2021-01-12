package com.paulo.observer;

public class Blog extends Subject {

	private String state;
	private String blogName;

	public Blog(String state, String blogName) {
		this.state = state;
		this.blogName = blogName;
	}

	public void addNewPost() {
		notifyObserver();
	}

}
