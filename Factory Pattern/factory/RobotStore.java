package factory;

public class RobotStore {
	
	public Robot createRobot() {
		Robot robot = makeRobot();
		Head head = makeHead();
		Hand leftHand = makeHand();
		Hand rightHand = makeHand();
		Body body = makeBody();
		Leg leftLeg = makeLeg();
		Leg rightLeg = makeLeg();
		
		robot.setItsHead(head);
		robot.setItsBody(body);
		robot.setItsLeftHand(leftHand);
		robot.setItsrightHand(rightHand);
		robot.setItsLeftLeg(leftLeg);
		robot.setItsrightLeg(rightLeg);
		
		return robot;
	}

	public Leg makeLeg() {
		return new Leg();
	}

	public Body makeBody() {
		return new Body();
	}

	public Hand makeHand() {
		return new Hand();
	}

	public Head makeHead() {
		return new Head();
	}

	public Robot makeRobot() {
		return new Robot();
	}
}
