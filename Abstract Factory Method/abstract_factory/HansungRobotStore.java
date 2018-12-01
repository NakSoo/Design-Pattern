package abstract_factory;

public class HansungRobotStore extends RobotFactory {
	
	
	public Leg makeLeg() {
		return new HansungLeg();
	}
	
	@Override
	public Body makebody() {
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
