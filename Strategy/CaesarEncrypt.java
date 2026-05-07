package Strategy;

public class CaesarEncrypt implements EncryptStrategy {
	@Override
	public <T> void encrypt(T data) {
		System.out.println("CaesarEncrypt");
	}
}
