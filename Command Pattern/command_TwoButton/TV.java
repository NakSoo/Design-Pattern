package command_TwoButton;

public class TV {
	private boolean powerOn = false;
	private boolean muteOn = false;
	
	public void power() {
		powerOn = !powerOn;
		
		if(powerOn)
			System.out.println("Power On");
		else
			System.out.println("Power OFF");
	}
	
	public void mute() {
		if(!powerOn)
			return;
		muteOn = !muteOn;
		
		if(muteOn)
			System.out.println("Mute On");
		else
			System.out.println("Mute OFF");
	}

	
}
