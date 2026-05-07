package Observer;

import java.util.ArrayList;
import java.util.List;

public class Connection implements Subject {
	private String status;
	private List<Observer> observers = new ArrayList<>();
	
	public Connection(String status) {
		this.status = status;
	}
	
	@Override
	public void attach(Observer observer) {
		if(!observers.contains(observer)) {
			observers.add(observer);
		}
	}
	
	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObserver() {
		for(Observer ob: observers) {
			ob.update(status);
		}
	}
	
	//đăng trạng thái mới
	public void setStatus(String status) {
		this.status = status;
		System.out.println("User update status: " + status);
		notifyObserver();
	}
}
