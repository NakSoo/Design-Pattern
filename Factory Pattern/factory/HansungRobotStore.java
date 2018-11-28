package factory;

public class HansungRobotStore extends RobotStore {
	
	
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
		return new HansungHead();
	}

	public Robot makeRobot() {
		return new HansungRobot();
	}
}
