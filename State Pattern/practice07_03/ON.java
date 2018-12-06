package practice07_03;


public class ON implements State {
	
	public static ON on = new ON();
	
	private ON() {}
	
	public static ON getInstance() {
		return on;
	}
		
	@Override
	public void on_button(Light light) {
		System.out.println("반응 없음");
		
	}

	@Override
	public void off_button(Light light) {
		light.setState(OFF.getInstance());
		System.out.println("Light Off");
		
	}

	@Override
	public void sleep_button(Light light) {
		light.setState(SLEEP.getInstance());
		System.out.println("Sleep mode");
		
	}
	
}
