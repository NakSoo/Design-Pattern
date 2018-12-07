package practice08_02;

public class TvMuteCommander implements Command {

	private TV tv;
	
	public TvMuteCommander(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.mute();
	}

}
