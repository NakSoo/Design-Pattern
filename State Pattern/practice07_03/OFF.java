package practice07_03;

public class OFF implements State {
	
	public static OFF off = new OFF();
	
	private OFF() {}
	
	public static OFF getInstance() {
		return off;
	}

	@Override
	public void on_button(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light ON");

	}

	@Override
	public void off_button(Light light) {
		System.out.println("반응 없음");
	}

	@Override
	public void sleep_button(Light light) {
		System.out.println("반응 없음");

	}

}
