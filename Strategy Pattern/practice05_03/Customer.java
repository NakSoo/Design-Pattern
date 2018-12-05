package practice05_03;

public class Customer {
	private String name;
	private double price;
	
	public Customer(String name) {
		this.name = name;
		this.price = 0;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void addPrice(double price) {
		this.price += price;
	}
	
}
