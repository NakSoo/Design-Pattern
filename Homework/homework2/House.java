package homework2;

import java.util.Vector;

public class House {

	private static Vector<House> houses = new Vector<House>();
	private static int count =0;
	
	private House() {}
	
	public static synchronized House getInstance() {
		if(houses.size() < 5) {
			houses.add(new House());
			count++;
		}
		return houses.elementAt((int)(Math.random()*count));
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
