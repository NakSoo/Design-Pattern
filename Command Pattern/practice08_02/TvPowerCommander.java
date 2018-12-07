package practice08_02;

public class TvPowerCommander implements Command {
	
	private TV tv;
	
	public TvPowerCommander(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.power();
	}

}
