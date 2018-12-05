package practice05_03;

public class Main {
	public static void main(String [] args) {
		Customer cutomer1 = new Customer("customer1");
		Customer cutomer2 = new Customer("customer2");
		
		Book book1 = new Book("book1", 2005, 1000);
		Book book2 = new Book("book1", 2004, 1200);
		Book book3 = new Book("book1", 2001, 4300);
		
		Rental rental1 = new Rental(cutomer1, book2, new Ordinary(), 2);
		Rental rental2 = new Rental(cutomer2, book1, new Ordinary(), 3);
		Rental rental3 = new Rental(cutomer2, book3, new Ordinary(), 4);
		Rental rental4 = new Rental(cutomer1, book2, new Ordinary(), 3);
		
		System.out.println(rental1.getPrice());
		System.out.println(rental2.getPrice());
		System.out.println(rental3.getPrice());
		System.out.println(rental4.getPrice());
		
	}
}
