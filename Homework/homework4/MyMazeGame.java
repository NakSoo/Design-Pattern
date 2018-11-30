package homework4;

public class MyMazeGame extends MazeGameCreator {
	
	@Override
	public Maze makeMaze() {
		return new Maze();
	}
	
	@Override
	public Room makeRoom(int roomNumber) {
		return new Room(roomNumber);
	}
	
	@Override
	public Door makeDoor(int doorNumber) {
		return new Door(doorNumber);
	}
	
	@Override
	public Wall makeWall() {
		return new Wall();
	}

}
