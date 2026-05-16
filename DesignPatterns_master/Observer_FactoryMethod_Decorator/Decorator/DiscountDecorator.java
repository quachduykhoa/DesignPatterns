package Decorator;

import FactoryMethod.ISender;

public class DiscountDecorator extends SenderDecoratorBase {
	public DiscountDecorator(ISender sender) {
		super(sender);
	}
	
	@Override
	public void send(String message) {
		message += "\n Mã giảm: KHOADUY";
		sender.send(message);
	}
}
