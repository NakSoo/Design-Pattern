package generalization;

public class Song {
	private String mode;
	private String title;
	private double price;
	
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getMode() {
		return this.mode;
	}

	public	 String getTitle() {
		return title;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDiscountMode() {
		return this.mode;
	}
	
}
