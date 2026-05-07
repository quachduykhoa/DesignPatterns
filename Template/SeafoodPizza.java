package Template;

public class SeafoodPizza extends PizzaTemplate {
    @Override
    protected void addToppings() {
        System.out.println("Thêm tôm, mực");
    }
}
