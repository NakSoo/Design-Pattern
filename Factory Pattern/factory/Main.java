package factory;

public class Main {
	public static void main(String [] args) {
		RobotStore rs = new RobotStore();
		Robot robot = rs.createRobot();
		
		RobotStore hrs = new HansungRobotStore();
		Robot hrobots = hrs.createRobot();
	}
}
