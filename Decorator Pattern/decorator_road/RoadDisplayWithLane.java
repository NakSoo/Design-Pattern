package decorator_road;

public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw();
		drawLane();
	}
	
	public void drawLane() {
		System.out.println("���� ǥ��");
	}
}
