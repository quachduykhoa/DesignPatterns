package Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements ISubject{
	private List<IObserver> observers = new ArrayList<>();
	private String status;
	
	@Override
	public void attach(IObserver o) {
		if(!observers.contains(o)){
			observers.add(o);
		}
	}
	
	@Override
	public void detach(IObserver o) {
		observers.remove(o);
	}
	
	@Override
	public void notifyObservers(String message) {
		for(IObserver o : observers) {
			o.update(message);
		}
	}
	
	public void setStatus(String status) {
		this.status = status;
		
		notifyObservers("Set status: " +  status);
	}
}
