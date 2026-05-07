package Template;

public class Client {
	public static void main(String[] args) {
		PizzaTemplate seafood = new SeafoodPizza();
		seafood.makePizza();
		
		System.out.println("-------------");

        PizzaTemplate cheese = new CheesePizza();
        cheese.makePizza();
	}
}
