package AbstractFactory;

public class MountainWheel implements Wheel{
    
    @Override
    public void createWheel() {
        System.out.println("Create a mountain bike wheel");
    }
}
