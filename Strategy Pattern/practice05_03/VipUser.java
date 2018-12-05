package practice05_03;

public class VipUser implements PricePolicy {

	@Override
	public double calculate(double price, int num) {	
		return price*num*0.9;
	}

}
