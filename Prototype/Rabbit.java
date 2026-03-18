package Prototype;

public class Rabbit implements Cloneable_Prototype<Rabbit> {
	private String hoTen;
	private String color;
	
	private Person owner;
	
	
	public Rabbit(String hoTen, String color , Person owner) {
		this.hoTen = hoTen;
		this.color = color;
		this.owner = owner;
	}
	
//	private  Rabbit (Rabbit rabbitOrther) {
//		this.hoTen = rabbitOrther.hoTen;
//		this.color = rabbitOrther.color;
//		this.owner = rabbitOrther.owner.clone();
//	}
	
	@Override
	public Rabbit clone() {
		return new Rabbit(this.hoTen, this.color, this.owner.clone());
	}

	@Override
	public String toString() {
		return "Rabbit [hoTen=" + hoTen + ", color=" + color + ", owner=" + owner + "]";
	}

	public String getHoten() {
		return hoTen;
	}
	
	public String getColor() {
		return color;
	}

	public Person getOwner() {
		return owner;
	}
	
	
}
