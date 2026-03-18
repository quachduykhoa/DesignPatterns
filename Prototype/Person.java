package Prototype;

public class Person implements Cloneable_Prototype<Person> {
	public String name;

	public Person(String name) {
		this.name = name;
	}
	
//	private Person (Person personOrther) {
//		this.hoTen = personOrther.hoTen;
//	}
	
	public Person clone() {
		return new Person(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
