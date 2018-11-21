package command_reomote;

public class Main {

	public static void main(String[] args) {
		ButtonController bc = new ButtonController();
		
		TV tv = new TV();
		Command tvCommand = new TvPowerCommand(tv);
		
		bc.setCommand(tvCommand);
		bc.pressed();
		bc.pressed();
		bc.pressed();
		bc.pressed();
		
		StopWatch stopWatch = new StopWatch();
		Command stopWatchCommand = new StopWatchDoitCommand(stopWatch);
		bc.setCommand(stopWatchCommand);
		bc.pressed();
		bc.pressed();
		bc.pressed();
		bc.pressed();
		
		PC pc = new PC();
		Command pcCommand = new PcPowerCommand(pc);
		bc.setCommand(pcCommand);
		bc.pressed();
		bc.pressed();
		bc.pressed();
		bc.pressed();
		
		
		
	}

}

