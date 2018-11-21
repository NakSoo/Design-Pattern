package command_reomote;

public class StopWatchDoitCommand implements Command {
	
	private StopWatch stopWatch;
	
	public StopWatchDoitCommand(StopWatch stopWatch) {
		this.stopWatch = stopWatch;
	}
	

	@Override
	public void execute() {
		stopWatch.doit();

	}

}
