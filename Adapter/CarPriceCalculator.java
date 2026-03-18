package Adapter;

public class CarPriceCalculator implements PriceCalculator {
	private double giaGoc;
	
	
	public CarPriceCalculator(double giaGoc) {
		this.giaGoc = giaGoc;
	}



	@Override
	public double calculatePrice() {
		return giaGoc * 0.5;
	}
}
