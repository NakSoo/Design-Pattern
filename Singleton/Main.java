package singleton;

public class Main {
	
	public static void main(String [] args) {
		User [] users = new User[10];
		
		int i = 0; 
		for(User user : users) {
			users[i] = new User("naksoo" + i);
			users[i].start();
			i++;
		}
		
	}
	


/*public static void main(String[] args) {
		Printer printer1 = Printer.getInstance();
		printer1.print("Hello!!!");
		
		System.out.println("using " + printer1.toString());
		
		Printer printer2 = Printer.getInstance();
		printer2.print("Hello2!!!");
		System.out.println("using " + printer2.toString());

	}
*/
}
