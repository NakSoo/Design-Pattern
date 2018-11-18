package generalization;

public class Main {
	public static void main(String [] args) {
		Song s1 = new Song();
		s1.setPrice(500);
		s1.setMode("NonDiscounted");
		
		Song s2 = new Song();
		s2.setPrice(800);
		s2.setMode("NonDiscounted");
		
		Song s3 = new Song();
		s3.setPrice(500);
		s3.setMode("OnSale");
		
		Song s4 = new Song();
		s4.setPrice(1000);
		s4.setMode("TodayEvent");
		
		CartForSong c = new CartForSong();
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		
		System.out.println(c.calculateTotalPrice());
	}
}
