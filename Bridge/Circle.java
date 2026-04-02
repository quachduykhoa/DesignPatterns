package Bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}
	
	public void withColor() {
		System.out.println("Hình tròn ");
		color.withColor();
	}
	
}
