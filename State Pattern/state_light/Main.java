package state_light;

public class Main {
	public static void main(String[] args) {
		Light light = new Light();
		light.setState(new Off());
		
		light.on_button_pushed();
		light.off_button_pushed();
		light.off_button_pushed();
		light.on_button_pushed();
		light.on_button_pushed();
	}
}