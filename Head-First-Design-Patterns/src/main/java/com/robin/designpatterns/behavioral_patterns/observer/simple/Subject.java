package com.robin.designpatterns.behavioral_patterns.observer.simple;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
