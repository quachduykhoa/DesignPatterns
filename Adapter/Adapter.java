package Adapter;

public class Adapter implements PriceCalculator {
	private UKCarPriceCalculator ukalculator;

	public Adapter(UKCarPriceCalculator ukalculator) {
		this.ukalculator = ukalculator;
	}
	
	@Override
	public double calculatePrice() {
		return ukalculator.getPrice();
	} 
}
