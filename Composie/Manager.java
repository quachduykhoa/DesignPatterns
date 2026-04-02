package Composie;

public class Manager implements Payee {
	private String name;

	public Manager(String name) {
		this.name = name;
	}
	
	@Override
	public void payExpenses(int amount) {
		System.out.println("Manager " + name + " đã được thanh toán " + amount + "dolaar");
	}
	
	public String getName() {
		return name;
	}
	
}
