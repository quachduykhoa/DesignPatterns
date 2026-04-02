package Decorator;

public class ComponentsWithBlueFrame extends ComponentDecorator {

	public ComponentsWithBlueFrame(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String draw() {
		return super.draw() + setBlueFrame();
	}
	
	private String setBlueFrame() {
		return "Khung màu xanh ";
	}
}
