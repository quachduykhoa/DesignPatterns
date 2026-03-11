package AbstractFactory;

public class MountainBikeFactory extends BikeAbstractFactory  {
    @Override
    public Wheel CreateWheel() {
        return new MountainWheel();
    }
    
    @Override
    public Frame CreateFrame() {
    	return new MountainFrame();
    }
    
}
