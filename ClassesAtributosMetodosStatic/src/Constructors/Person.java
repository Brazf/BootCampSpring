package Constructors;

public class Person {

	private String name;
	private int age;
	private double height;
	
	public Person () {}
	
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height;
	}
	
}
