package com.paulo.observer;

public class Subscriber implements Observer {
	
	private String userName;
	
	public Subscriber(String userName) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
	}
	
	@Override
	public void update() {
		System.out.println("New Post user: " + userName);
	}

}
