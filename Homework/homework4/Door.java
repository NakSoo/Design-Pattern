package homework4;

public class Door implements MapSite {
	
	private int doorNumber;
	
	public Door(int doorNumber) {
		System.out.println("Creating Door " + doorNumber);
		this.doorNumber = doorNumber;
	}
	
	public int getDoorNumber() {
		return doorNumber;
	}
	
	@Override
	public String getStructure() {
		return "Door";
	}

}
