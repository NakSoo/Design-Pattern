package newgeneralization;

import java.util.ArrayList;
//import java.util.Iterator;

public class CartForSong {
	ArrayList<Song> cart = new ArrayList<Song>();
	
	public double calculateTotalPrice() {
		double total = 0.0;
		
		for(Song s : cart) {
			DiscountMode mode = s.getMode();
			total += mode.getDiscountRate()*s.getPrice();
		}
		
		return total;
	}
	
	public void add(Song s) {
		cart.add(s);
	}
}

