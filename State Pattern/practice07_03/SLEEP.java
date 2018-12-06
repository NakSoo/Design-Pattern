package practice07_03;

public class SLEEP implements State {
	
	public static SLEEP sleep = new SLEEP();
	
	private SLEEP() {}
	
	public static SLEEP getInstance() {
		return sleep;
	}

	@Override
	public void on_button(Light light) {
		System.out.println("반응 없음");
	}

	@Override
	public void off_button(Light light) {
		light.setState(OFF.getInstance());
		System.out.println("Light OFF");
	}

	@Override
	public void sleep_button(Light light) {
		System.out.println("반응 없음");
	}

}
