package AbstractFactory;

public class RoadWheel implements Wheel {
    @Override
    public void createWheel() {
        System.out.println("Create a road bike wheel");
    }
}
