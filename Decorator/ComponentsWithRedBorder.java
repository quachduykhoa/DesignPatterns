package Decorator;

public class ComponentsWithRedBorder extends ComponentDecorator {

	public ComponentsWithRedBorder(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public String draw() {
		return super.draw() + setRedBorder(); //super gọi lại logic lớp cha
	}
	
	private String setRedBorder() {
		return "Viền màu đỏ";
	}
}
