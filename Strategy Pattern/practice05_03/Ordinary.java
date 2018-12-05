package practice05_03;

public class Ordinary implements PricePolicy {

	@Override
	public double calculate(double price, int num) {
		return price*num;
	}

}
