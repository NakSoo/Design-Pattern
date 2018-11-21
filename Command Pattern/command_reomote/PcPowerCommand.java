package command_reomote;

public class PcPowerCommand implements Command {
	
	private PC pc;
	
	public PcPowerCommand(PC pc) {
		this.pc = pc;
	}

	@Override
	public void execute() {
		pc.power();

	}

}
