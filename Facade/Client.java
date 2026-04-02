package Facade;

public class Client {
	public static void main(String[] args) {
		HolidayFacade.getINSTANCE().bookHoliday();
	}
}
