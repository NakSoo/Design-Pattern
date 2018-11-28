package factory;

public class MyRobotStore extends RobotStore {
	public Leg makeLeg() {
		return new HansungLeg();
	}

	public Body makeBody() {
		return new HansungBody();
	}

	public Hand makeHand() {
		return new HansungHand();
	}

	public Head makeHead() {
		return new HeadWithSmile();
	}

	public Robot makeRobot() {
		return new HansungRobot();
	}
}
