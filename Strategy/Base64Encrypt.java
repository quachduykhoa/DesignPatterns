package Strategy;

public class Base64Encrypt implements EncryptStrategy{
	@Override
	public <T> void encrypt(T data) {
		System.out.println("Base64Encrypt");
	}
}
