package Composie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTeam implements Payee, Operations{
	private List<Payee> payees = new ArrayList<>();
	
//c1 dùng varags
//	public void addPayee(Payee... p) {
//		payees.addAll(Arrays.asList(p));
//	}
	
	//c2
	public void addPayess(Payee p) {
		payees.add(p);
	}
	
	@Override
	public void payExpenses(int amount) {
		for (Payee p : payees) {
			p.payExpenses(amount);
		}
	}
}
