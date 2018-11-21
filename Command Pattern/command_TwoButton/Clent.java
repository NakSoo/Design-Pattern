package command_TwoButton;

public class Clent {
	public static void main(String [] args) {
		TV tv= new TV();
		TwoButtonController rc = new TwoButtonController();
		Command tvPowerCom = new TvPowerCommand(tv);
		Command tvMuteCom = new TvMuteCommand(tv);
		
		rc.setCommand(tvPowerCom, tvMuteCom);
		
		rc.button1Pressed();
		rc.button2Pressed();
		rc.button2Pressed();	
		rc.button1Pressed();
		
		TV tv1= new TV();
		TV tv2= new TV();
		Command tvPowerCom1 = new TvPowerCommand(tv1);
		Command tvPowerCom2 = new TvPowerCommand(tv2);
		
		rc.setCommand(tvPowerCom1, tvPowerCom2);
		rc.button1Pressed();
		rc.button2Pressed();
		rc.button2Pressed();	
		rc.button1Pressed();
	}
		
}
