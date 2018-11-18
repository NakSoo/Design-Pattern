package newgeneralization;

public class Main {
	public static void main(String [] args) {
		
		Song s1 = new Song();
		Song s2 = new Song();
		Song s3 = new Song();
		Song s4 = new Song();
		
		s1.setPrice(500);
		s2.setPrice(800);
		s3.setPrice(500);
		s4.setPrice(1000);
		
		s1.setMode(new OnSale());
		s2.setMode(new TodayEvent());
		s3.setMode(new ChristmasEvent());
		s4.setMode(new NonDiscount());
		
		CartForSong c = new CartForSong();
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		
		System.out.println(c.calculateTotalPrice());
	}
}
