package Btap_1a;

public class PrintSpooler {
	private static PrintSpooler instance = null;
	private PrintSpooler() {
		init();
	}
	
	// Xu ly qua trinh khoi tao phuc tap hon
	private void init() {
		System.out.println("xu ly qua trinh khoi tao phuc tap hon");
	}
	
	public static PrintSpooler getInstance() {
		if( instance == null) {
			instance = new PrintSpooler();
		}
		return instance;
	}
	
	public void display() {
		System.out.println("Xin chào");
	}
}
