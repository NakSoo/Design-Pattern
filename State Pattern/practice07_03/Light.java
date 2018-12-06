package practice07_03;

public class Light {
	private State state;
	
	public Light() {
		state = OFF.getInstance();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void on_button_pushed() {
		state.on_button(this);
	}
	
	public void off_button_pushed() {
		state.off_button(this);
	}
	
	public void sleep_button_pushed() {
		state.sleep_button(this);	
	}
	
}
