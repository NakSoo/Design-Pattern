package generalization;

import java.util.ArrayList;
//import java.util.Iterator;

public class CartForSong {
	ArrayList<Song> cart = new ArrayList<Song>();
	
	public double calculateTotalPrice() {
		double total = 0.0;
		//Iterator<Song> itr = cart.iterator();
		
		/*
		while(itr.hasNext()) {
			Song s = itr.next();
			
			if(s.getDiscountMode().equals("OnSale")) 
				total = total + (s.getPrice() - 0.1* s.getPrice());
			else if(s.getDiscountMode().equals("TodayEvent"))
				total = total + (s.getPrice() - 0.3 * s.getPrice());
			else
				total = total + s.getPrice();
		}*/
		
		for(Song s : cart) {
			String mode = s.getMode();
			if(mode.equals("OnSale"))
				total += 0.9 * s.getPrice();
			else if(mode.equals("TodayEvent"))
				total += 0.7* s.getPrice(); 
			else if(mode.equals("ChristmasEvent"))
				total += 0.1* s.getPrice();
			else
				total += s.getPrice();
		}
		
		return total;
	}
	
	public void add(Song s) {
		cart.add(s);
	}
}

