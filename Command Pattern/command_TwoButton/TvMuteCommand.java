package command_TwoButton;

public class TvMuteCommand implements Command {
	
	private TV theTv;
	
	public TvMuteCommand(TV theTv) {
		this.theTv = theTv;
	}

	@Override
	public void execute() {
		theTv.mute();

	}

}
