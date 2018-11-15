package observer_homework;

public class LowBatteryWarning implements Observer{
	private static final int LOW_BATTERY = 40;
	private Battery battery;
	
	public LowBatteryWarning(Battery battery) {
		this.battery = battery;
	}
	
	public void update() {
		int level = battery.getLevel();
		if(level < LOW_BATTERY)
			System.out.println("<Warning> Low Battery: " + level + " Compared with " + LOW_BATTERY);
	}
}