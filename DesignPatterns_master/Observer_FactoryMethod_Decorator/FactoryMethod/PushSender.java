package FactoryMethod;

public class PushSender implements ISender {
	@Override
	public void send(String message) {
		System.out.println("Gửi PUSH: " + message);
	}
}
