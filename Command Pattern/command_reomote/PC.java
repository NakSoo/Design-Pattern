package command_reomote;

public class PC {
	
	private boolean powerOn = false;

	public void power() {
		powerOn = !powerOn;
		if (powerOn) 
			System.out.println("PC on");
		else
			System.out.println("PC off");
		
	}
}
