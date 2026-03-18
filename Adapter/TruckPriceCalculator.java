package Adapter;

public class TruckPriceCalculator implements PriceCalculator {
	private double giaGoc;
	
	public TruckPriceCalculator(double giaGoc) {
		this.giaGoc = giaGoc;
	}

	@Override
	public double calculatePrice() {
		return giaGoc * 1.5;
	}
}
