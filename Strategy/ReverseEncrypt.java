package Strategy;

public class ReverseEncrypt implements EncryptStrategy {
	@Override
	public <T> void encrypt(T data) {
		System.out.println("ReverseEncrypt");
	}
}
