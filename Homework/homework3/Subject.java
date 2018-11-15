package observer_homework;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update();
		}
			
	}
}
