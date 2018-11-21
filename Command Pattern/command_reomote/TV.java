package command_reomote;

public class TV {
	private boolean powerOn = false;
	
	public void power() {
		powerOn = !powerOn;
		if(powerOn) 
			System.out.println("Tv ON");
		else
			System.out.println("Tv OFF");
	}
}
