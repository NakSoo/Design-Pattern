package homework2;

public class Owner extends Thread {
	public Owner(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		House house = House.getInstance();
		house.print(Thread.currentThread().getName() + "house living "+ house.toString() +"." );
	}
}
