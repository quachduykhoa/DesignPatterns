package Decorator;

import FactoryMethod.ISender;

public abstract class SenderDecoratorBase implements ISender{
	protected ISender sender;
	
	public SenderDecoratorBase(ISender sender) {
		this.sender = sender;
	}
}
