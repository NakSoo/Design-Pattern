package state_light;

public class Mood implements State {

	@Override
	public void on_button_pushed(Light light) {
		light.setState(new On());
		System.out.println(this);

	}

	@Override
	public void off_button_pushed(Light light) {
		light.setState(new Off());
		System.out.println(this);
	}

	@Override
	public void moodLight(Light light) {
		// TODO Auto-generated method stub

	}
	
	public String toString() {
		return "Mood State";
	}

}
