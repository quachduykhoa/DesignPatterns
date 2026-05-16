package FactoryMethod;

public class EmailSender implements ISender{
	@Override
	public void send(String message) {
		System.out.println("Gửi EMAIL: " + message);
	}
}
