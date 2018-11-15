package command_reomote;

public class Alarm {
	
	private boolean powerOn = false;

	public void turn_on_off() {
		powerOn = !powerOn;
		if (powerOn) 
			System.out.println("Lamp on");
		else
			System.out.println("Lamp off");
		
	}
}
