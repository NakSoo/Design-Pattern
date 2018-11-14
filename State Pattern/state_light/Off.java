package state_light;

public class Off implements State {

	@Override
	public void on_button_pushed(Light light) {
		light.setState(new On());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println(this);
	}
	
	@Override
	public void moodLight(Light light) {
		
	}
	
	
	public String toString() {
		return "Off state";
	}
	

}
