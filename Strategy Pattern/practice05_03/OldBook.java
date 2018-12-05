package practice05_03;

public class OldBook implements PricePolicy {

	@Override
	public double calculate(double price, int num) { 
			return price*0.5*num;
	}

}
