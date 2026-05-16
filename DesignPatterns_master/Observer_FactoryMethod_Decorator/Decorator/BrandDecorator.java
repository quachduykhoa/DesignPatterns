package Decorator;

import FactoryMethod.ISender;

public class BrandDecorator extends SenderDecoratorBase {
	public BrandDecorator(ISender sender) {
		super(sender);
	}
	
	@Override
	public void send(String message) {
		message = message + "\n Shop";
		sender.send(message);
	}
}
