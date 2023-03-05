package Constructors;

public class Main {
	
	
	public static void main(String[] args) {
	
		// TESTE NORMAL DE CONSTRUTOR
		
		Person person1 = new Person("Fábio", 25, 29.0);
		
		System.out.println(person1);
		
		// TESTE CONSTRUTOR COM HERITAGE( HERANÇA )
		
		PersonHeritage person2 = new PersonHeritage("Fábio", 25, 29.0, "Black");
		
		System.out.println(person2);
	
	}	
}
