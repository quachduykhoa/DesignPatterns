package Composie;

public class SalesPerson implements Payee{
	private Manager manager;
	private String name;
	public SalesPerson(Manager manager, String name) {
		this.manager = manager;
		this.name = name;
	}
	
	@Override
	public void payExpenses(int amount) {
		System.out.println("Manager " + manager.getName() +  " Salesperson " +  name + " đã thanh toán" + amount + "dollars");
	}
	
	
}
