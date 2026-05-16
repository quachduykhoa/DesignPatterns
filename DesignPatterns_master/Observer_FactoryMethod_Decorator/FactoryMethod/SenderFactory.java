package FactoryMethod;

public class SenderFactory {
	public static ISender createSender(MaterialType materialType) {
		switch (materialType) {
		case EMAIL: {
			return new EmailSender();
		}
		case SMS: {
			return new SMSSender();
		}
		case PUSH: {
			return new PushSender();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + materialType);
		}
	}
}
