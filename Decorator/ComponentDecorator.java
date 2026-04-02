package Decorator;

public abstract class ComponentDecorator implements Component {
	private Component component;

	public ComponentDecorator(Component component) {
		this.component = component;
	}
	
	//hành vi gọi lại gốc của circlecomponent trước khi thêm (vd: phải có bánh mới them ttopping được)
	public String draw() {
		return component.draw();
	}
}
