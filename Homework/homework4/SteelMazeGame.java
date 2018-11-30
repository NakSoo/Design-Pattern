package homework4;

public class SteelMazeGame extends MazeGameCreator {

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
		return new SteelDoor(doorNumber);
	}

	@Override
	public Wall makeWall() {
		return new SteelWall();
	}

}
