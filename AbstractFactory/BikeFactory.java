package AbstractFactory;

public class BikeFactory {
	private  BikeFactory () {
		
	}
	
	public static BikeAbstractFactory getFactory(MaterialType materialType) {
		switch (materialType) {
		case MountainBikeFactory: {
			
			return new MountainBikeFactory();
		}
		case RoadBikeFactory: {
			return new RoadBikeFactory();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + materialType);
		}
	}
}
