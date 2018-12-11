package templateMethod;

public class PagePrinter {
	//Template Method
	public void print(String contents, int pageNum) {
		printHeader();
		System.out.println(contents);
		printFooter();
		if(wantPrint())
			System.out.println(pageNum);
	}
	
	private boolean wantPrint() {
		return true;
	}
	
	public void printHeader() {
		System.out.println("*****************");
	}
	
	public void printFooter() {
		System.out.println("*****************");
	}
}
