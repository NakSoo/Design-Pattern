package abstract_factory;

public class MyRobotStore extends RobotFactory {
	public Leg makeLeg() {
		return new HansungLeg();
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

	public Body makebody() {
		return new HansungBody();
	}
}
