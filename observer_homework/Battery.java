package observer_homework;

public class Battery extends Subject {
	private int level = 100; //배터리 처음 용량
	
	public void consume(int amount) {
		if(level > 0) { 
			level -= amount;
			notifyObserver();
		}
	}
	
	public void charge(int amount) {
		if(level < 100) {
			level += amount;
			notifyObserver();
		}
	}
	
	public int getLevel() {
		return level;
	}
}