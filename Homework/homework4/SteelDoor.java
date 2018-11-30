package homework4;

public class SteelDoor extends Door {

	public SteelDoor(int doorNumber) {
		super(doorNumber);
		System.out.println("Creating SteelDoor " + doorNumber );
	}

	@Override
	public String getStructure() {
		return "SteelDoor";
	}

}
