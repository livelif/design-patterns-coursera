package com.paulo.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	List<Observer> observers = new ArrayList<>();
	
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}
	
	public void unregisterObserver(Observer obs) {
		observers.remove(obs);
	}
	
	public void notifyObserver() {
		for (Observer obs : observers) {
			obs.update();
		}
	}
}
