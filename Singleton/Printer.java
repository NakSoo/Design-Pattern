package singleton;

public class Printer {
	private static Printer printer = null;
	
	private Printer() {}
	
	public static synchronized Printer getInstance() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	
}

