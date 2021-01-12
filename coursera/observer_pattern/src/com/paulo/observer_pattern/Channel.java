package com.paulo.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	List<Observer> observers = new ArrayList<>();
	private String status;
	private String channelName;
	
	
	
	public Channel(String channelName) {
		this.channelName = channelName;
	}


	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String newStatus) {
		this.status = newStatus;
		for (Observer o : observers) {
			o.update(status);
		}
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

}
