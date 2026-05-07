package Template;

public class CheesePizza extends PizzaTemplate {
	@Override
    protected void addToppings() {
        System.out.println("Thêm phô mai");
    }
}
