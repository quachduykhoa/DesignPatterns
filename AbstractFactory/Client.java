package AbstractFactory;

public class Client {
	public static void main(String[] args) {
		BikeAbstractFactory factory = BikeFactory.getFactory(MaterialType.MountainBikeFactory);
		
		Wheel wheel = factory.CreateWheel();
		wheel.createWheel(); //Create mountain wheel 
		
		Frame frame = factory.CreateFrame();
		frame.createFrame(); //Create mountain frame 
		
	}
}
