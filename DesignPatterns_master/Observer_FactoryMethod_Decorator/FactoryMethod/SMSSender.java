package FactoryMethod;

public class SMSSender implements ISender{
	@Override
	public void send(String message) {
		System.out.println("Gửi SMS: " + message);
	}
}
