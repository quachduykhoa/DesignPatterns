package Facade;

public class HolidayFacade {
	private static final HolidayFacade INSTANCE = new HolidayFacade();
	
	private CarRentals carRentals;
	private FlightArrangements flightArrangements;
	private HotelBookings hotelBookings;
	
	
	private HolidayFacade() {
		carRentals = new CarRentals();
		flightArrangements = new FlightArrangements();
		hotelBookings = new HotelBookings();
	}
	
	public static HolidayFacade getINSTANCE() {
		return INSTANCE;
	}
	
	public void bookHoliday() {
		carRentals.bookCar();
		flightArrangements.bookFlight();
		hotelBookings.bookHotel();
	}
}
