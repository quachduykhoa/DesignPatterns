package Proxy;

public class Proxy implements SuperMarket {
	private RealSubject realSubject;
	
	public void display() {
		getInstance();
		realSubject.display();
	}
	
	public void addItem(String item) {
		getInstance();
		realSubject.addItem(item);
	}
	
	public void getInstance() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		} 
	}
	
}
