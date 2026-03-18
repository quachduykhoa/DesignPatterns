package Prototype;

public class Client {
	public static void main(String[] args) {
		Person person1 = new Person("Duy Khoa");
		Rabbit rabbit1 = new Rabbit("Thỏ VN", "Red", person1);
		
		//clone
		Rabbit rabbit2 = rabbit1.clone();
		rabbit2.getOwner().setName("khoa duy");
		
		
		System.out.println("Tho 1 " + rabbit1);
		System.out.println("Tho 2 " + rabbit2);
	}
}
