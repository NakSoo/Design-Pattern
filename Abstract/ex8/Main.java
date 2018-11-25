package ex8;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		
		m2.setLevel(new Good());
		m1.setLevel(new Good());
		m2.setLevel(new VIP());
	}

}
