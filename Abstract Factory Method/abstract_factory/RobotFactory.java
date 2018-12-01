package abstract_factory;

public abstract class RobotFactory {
	
	public abstract Robot makeRobot();
	public abstract Head makeHead();
	public abstract Leg makeLeg();
	public abstract Hand makeHand();
	public abstract Body makebody();
}
