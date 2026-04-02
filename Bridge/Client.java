package Bridge;

public class Client {
	public static void main(String[] args) {
		Shape circle = new Circle(new Red());
		circle.withColor();
		
		System.out.println("------------------------");
		
		Shape triangle = new Triangle(new Blue());
		triangle.withColor();
		
	}
}
