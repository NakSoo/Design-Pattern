package templateMethod;

public class Main {
	public static void main(String [] args) {
		PagePrinter pp = new PagePrinter();
		pp.print("Goodbye!! Design Pattern Class", 10);
		
		PagePrinter mypp = new MyPagePrinter();
		mypp.print("Goodbye!! Design Pattern Class", 10);
		
		PagePrinter yourpp = new YourPagePrinter();
		yourpp.print("Goodbye!! Design Pattern Class", 10);
	}
}
