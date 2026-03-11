package AbstractFactory;

public class RoadBikeFactory extends BikeAbstractFactory {
    @Override
    public Wheel CreateWheel() {
        return new RoadWheel();
    }
    
    @Override 
    public Frame CreateFrame() {
    	return new RoadFrame();
    }
}
