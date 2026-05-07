package Strategy;

public class Client {
	public static void main(String[] args) {
		FileEncryptor encryptor = new FileEncryptor();
		
		encryptor.setStrategy(new Base64Encrypt());
        encryptor.process("Hello"); 
		encryptor.process(123);
		encryptor.process(5.5); 
		
		encryptor.setStrategy(new ReverseEncrypt());
        encryptor.process("Hello");
        encryptor.process(123);
	}
}
