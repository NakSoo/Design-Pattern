package command_TwoButton;

public class TwoButtonController {
	private Command theCommand1;
	private Command theCommand2;
	
	public void setCommand(Command theCommand1, Command theCommand2) {
		this.theCommand1 = theCommand1;
		this.theCommand2 = theCommand2;
	}
	
	public void button1Pressed() {
		theCommand1.execute();
	}
	
	public void button2Pressed() {
		theCommand2.execute();
	}
}
