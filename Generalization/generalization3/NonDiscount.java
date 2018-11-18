package newgeneralization;

public class NonDiscount extends DiscountMode {

	@Override
	public double getDiscountRate() {
		return 1.0;
	}

}
