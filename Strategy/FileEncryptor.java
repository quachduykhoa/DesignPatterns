package Strategy;

public class FileEncryptor {
	private EncryptStrategy strategy;
	
	public void setStrategy(EncryptStrategy strategy) {
		this.strategy = strategy;
	}
	
	public <T> void process(T data) {
		strategy.encrypt(data);
	}
	
}
