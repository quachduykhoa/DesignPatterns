package Main;

import FactoryMethod.MaterialType;
import Observer.*;

public class Client {
	public static void main(String[] args) {
		Order order = new Order();
		
		Customer customer1 = new Customer("Khoa", MaterialType.EMAIL);
		Customer customer2 = new Customer("Duy", MaterialType.PUSH);
		Customer customer3 = new Customer("KhoaDuy", MaterialType.SMS);
		
		//
		order.attach(customer1);
		order.attach(customer2);
		order.attach(customer3);
		order.attach(customer1); // khong in thêm lần này nữa vì đã dùng contains

		
		//
		order.setStatus("Đang xử lý");
		
		//
		System.out.println("==================");
		
		//
		order.setStatus("Đang giao");
		
	}
}
