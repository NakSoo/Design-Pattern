package homework4;

import java.util.ArrayList;

public class Maze {
	ArrayList<Room> rooms;
	
	public Maze() {
		System.out.println("Creating maze");
		rooms = new ArrayList<Room>();
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
	
	public String getStructure() {
		return "Maze";
	}

}
