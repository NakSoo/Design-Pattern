package practice05_03;

public class Rental {
	private Customer member;
	private Book book;
	private PricePolicy policy;
	private int num;
	
	public Rental(Customer member, Book book, PricePolicy pricePolicy, int num) {
		this.member = member;
		this.book = book;
		this.policy = pricePolicy;
		this.num = num;
	}
	
	public double getPrice() {
		return policy.calculate(book.getPrice(), num);
	}	
}