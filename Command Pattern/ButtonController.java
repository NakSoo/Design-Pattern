package command_reomote;

public class ButtonController {
	private Alarm theAlarm;

	
	public ButtonController(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}
	
	public void pressed() {
		theAlarm.turn_on_off();
	}
}
