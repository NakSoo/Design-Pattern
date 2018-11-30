package homework4;

public abstract class MazeGameCreator {
	
	public Maze createMaze() {
		 Maze maze = makeMaze();       
		 Room r1 = makeRoom(1);  
		 Room r2 = makeRoom(2);       
		 Door door1 = makeDoor(1);
		 Door door2 = makeDoor(2);   
		 maze.addRoom(r1);       
		 maze.addRoom(r2);       
		 r1.setSide(MazeGame.North, makeWall());
		 r1.setSide(MazeGame.East, door1);      
		 r1.setSide(MazeGame.South, makeWall());
		 r1.setSide(MazeGame.West, makeWall());
		 r2.setSide(MazeGame.North, makeWall());
		 r2.setSide(MazeGame.East, makeWall());
		 r2.setSide(MazeGame.South, makeWall());
		 r2.setSide(MazeGame.West, door2);
		 
		 System.out.println("Maze created completely");
		 return maze; 
	}
	
	public abstract Maze makeMaze();
	public abstract Room makeRoom(int roomNumber);
	public abstract Door makeDoor(int doorNumber);
	public abstract Wall makeWall();
}