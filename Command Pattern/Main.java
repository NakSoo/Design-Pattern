package command_reomote;

public class Main {

	public static void main(String[] args) {
		Lamp theLamp = new Lamp();
		ButtonController buttonController = new ButtonController(theLamp);
		
		buttonController.pressed();
		buttonController.pressed();
		buttonController.pressed();
		buttonController.pressed();
		

	}

}
