package practice08_02;

public class Client {

	public static void main(String[] args) {
		TwoButtonController twoButtonController = new TwoButtonController();
		TV tv = new TV();
		
		TvPowerCommander tvPower = new TvPowerCommander(tv);
		TvMuteCommander tvMuteCommander = new TvMuteCommander(tv);
		
		twoButtonController.setCommand(tvMuteCommander, tvPower);
		
		twoButtonController.button1Pressed();
		twoButtonController.button2Pressed();
		twoButtonController.button1Pressed();
		twoButtonController.button1Pressed();
		twoButtonController.button2Pressed();
		twoButtonController.button1Pressed();

	}

}

