package Adapter;

public class UKCarPriceCalculator {
	private double gia;
	
	
	
	public UKCarPriceCalculator(double gia) {
		this.gia = gia;
	}



	public double getPrice() {
		return gia * 1;
	}
}
