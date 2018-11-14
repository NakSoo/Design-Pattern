package state_light;

public class On implements State {

	@Override
	public void on_button_pushed(Light light) {
		light.setState(new Mood());
	}

	@Override
	public void off_button_pushed(Light light) {
		light.setState(new Off());
	}
	
	@Override
	public void moodLight(Light light) {
		
	}
	
	public String toString() {
		return "On State";
	}
}