package Template;

public abstract class PizzaTemplate {
    public final void makePizza() {
        prepareDough();
        addSauce();
        addToppings(); // khác nhau khong cho trùng lặp
        bake();
        cut();
        serve();
    }

    private void prepareDough() {
        System.out.println("Chuẩn bị bột");
    }

    private void addSauce() {
        System.out.println("Thêm sốt cà chua");
    }

    //cho phép class con thay đổi
    protected abstract void addToppings();

    private void bake() {
        System.out.println("Nướng pizza");
    }

    private void cut() {
        System.out.println("Cắt pizza");
    }

    private void serve() {
        System.out.println("Phục vụ pizza");
    }
}
