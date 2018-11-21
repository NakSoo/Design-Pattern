package command_reomote;

public class TvPowerCommand implements Command {
	
	private TV theTv;
	
	public TvPowerCommand(TV theTv) {
		this.theTv = theTv;
	}
	
	@Override
	public void execute() {
		theTv.power();
	}

}
