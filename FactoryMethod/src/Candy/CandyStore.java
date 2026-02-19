package Candy;

public class CandyStore {
	private AbstractCandy abstractCandy;
	
	public CandyStore(AbstractCandy abstractCandy) {
		this.abstractCandy =  abstractCandy;
	}
	
	public void orderCandy() {
		Candy candy = abstractCandy.getCandy();
		System.out.println(candy.getCandyName());
	}
	
	
}
