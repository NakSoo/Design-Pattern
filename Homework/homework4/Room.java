package homework4;

import java.util.HashMap;

public class Room implements MapSite {
	private int roomNumber;
	
	private HashMap<String, MapSite> roomStructure;
	
	public Room(int roomNumber) {
		System.out.println("Creating Room " + roomNumber);
		roomStructure = new HashMap<String, MapSite>();
		this.roomNumber = roomNumber;
	}
	
	public void setSide(String direction, MapSite structure) { 
		roomStructure.put(direction, structure);
		System.out.println(getStructure() + getRoomNumber() + ":" +  structure.getStructure() + " add at " +  direction);
		
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	@Override
	public String getStructure() {
		return "Room";
	}

}
