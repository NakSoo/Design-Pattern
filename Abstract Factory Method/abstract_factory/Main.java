package abstract_factory;

public class Main {
	public static void main(String [] args) {
		RobotFactory rf = new MyRobotFactory();
		RobotStore rs = new RobotStore();
		Robot robot = rs.createRobot();
	}
}
