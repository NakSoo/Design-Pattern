package newgeneralization;

public class Song {
	private DiscountMode mode;
	
	private String title;
	private double price;
	
	public void setMode(DiscountMode mode) {
		this.mode = mode;
	}
	
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public DiscountMode getMode() {
		return this.mode;
	}
		
}
