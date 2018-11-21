package command_reomote;

public class ButtonController {
	private Command theCommand;

	public void setCommand(Command theCommand) {
		this.theCommand = theCommand;
	}
	
	public void pressed() {
		theCommand.execute();
	}
}