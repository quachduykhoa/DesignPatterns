package Observer;

import Decorator.*;
import FactoryMethod.*;

public class Customer implements IObserver{
	private String name;
	private ISender sender;
	
	public Customer(String name, MaterialType materialType) {
		this.name = name;
		
		//factory tạo sender
		sender = SenderFactory.createSender(materialType);
		
		//decorator bọc thêm tính năng
		sender = new DiscountDecorator(sender);
		sender = new BrandDecorator(sender);
		
	}



	@Override
	public void update(String message) {
		sender.send(name + " nhận: " + message);
	}
}
