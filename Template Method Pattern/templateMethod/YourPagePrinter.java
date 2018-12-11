package templateMethod;

public class YourPagePrinter extends PagePrinter {
	public void printHeader() {
		System.out.println(">>>>>>>>>>>>>>>>>>>");
	}
	
	public void printFooter() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<");
	}
}
