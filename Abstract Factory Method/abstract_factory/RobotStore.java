package abstract_factory;

public class RobotStore {
	private RobotFactory factory;
	
	public void setRobotFactory(RobotFactory factory) {
		this.factory = factory;
	}
	
	public Robot createRobot() {
		
		Robot robot = factory.makeRobot();
		Head head = factory.makeHead();
		Hand leftHand = factory.makeHand();
		Hand rightHand = factory.makeHand();
		Body body = factory.makebody();
		Leg leftLeg = factory.makeLeg();
		Leg rightLeg = factory.makeLeg();
		
		robot.setItsHead(head);
		robot.setItsBody(body);
		robot.setItsLeftHand(leftHand);
		robot.setItsrightHand(rightHand);
		robot.setItsLeftLeg(leftLeg);
		robot.setItsrightLeg(rightLeg);
		
		return robot;
	}
}
