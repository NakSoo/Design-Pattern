package templateMethod;

public class MyPagePrinter extends PagePrinter {
		

	public void printHeader() {
		System.out.println("##################");
	}
	
	public void printFooter() {
		System.out.println("^^^^^^^^^^^^^^^^^^");
	}
}
