package Composie;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Manager manager1 = new Manager("Khoa duy");
		Manager manager2 = new Manager("Duy Khoa");
		
		SalesPerson s1 = new SalesPerson(manager1, "sale1");
		SalesPerson s2 = new SalesPerson(manager2, "sale2");
		
		//c1: varargs
//		SalesTeam team1 = new SalesTeam();
//		team1.addPayee(manager1, manager2, s1, s2);
//		team1.payExpenses(2000);
//		System.out.println("==========================================");
//		
		
		//c2 
		SalesTeam team2 = new SalesTeam();
		team2.addPayess(manager1);
		team2.addPayess(manager2);
		team2.addPayess(s1);
		team2.addPayess(s2);
		team2.payExpenses(1000);
				
	}
}
