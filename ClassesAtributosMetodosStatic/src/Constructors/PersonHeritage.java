package Constructors;

public class PersonHeritage extends Person{

	private String hairColor;
	
	public PersonHeritage(String name, int age, double height, String hairColor) {
		super(name, age, height);
		this.hairColor = hairColor;
	}

	@Override
	public String toString() {
		return super.toString()+ ", hairColor=" + hairColor + "]";
	}
	
}
