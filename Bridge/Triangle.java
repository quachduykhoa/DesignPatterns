package Bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}
	
	public void withColor() {
		System.out.println("Hình tam giác ");
		color.withColor();
	}
}
