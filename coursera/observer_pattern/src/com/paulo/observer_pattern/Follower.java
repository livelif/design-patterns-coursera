package com.paulo.observer_pattern;

public class Follower implements Observer {

	private String followerName;
	
	public Follower(String followerName) {
		this.followerName = followerName;
	}
	

	@Override
	public void update(String status) {
		if (status != null && status.equals("LIVE")) {
			play();
		}
		
		if (status != null && status.equals("OFF")) {
			System.out.println("Livestream offline");
		}
	}
	
	public void play() {
		System.out.println("The user " + followerName + " Playing");
	}
}
