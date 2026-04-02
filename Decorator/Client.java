package Decorator;

public class Client {
	public static void main(String[] args) {
		Component circle = new CircleComponent();
		System.out.println(circle.draw());
		
		Component component = new ComponentsWithRedBorder(new ComponentsWithBlueFrame(new CircleComponent()));
		System.out.println(component.draw());
	}
}
