package command_reomote;

public class StopWatch {
	
	private boolean start = false;
	
	public void doit() {
		start = !start;
		if(start) 
			System.out.println("StopWatch ON");
		else
			System.out.println("StopWatch OFF");
	}
}
