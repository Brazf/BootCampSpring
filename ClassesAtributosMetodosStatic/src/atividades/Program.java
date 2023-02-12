package atividades;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		Student stun = new Student();
		
		System.out.println("Digite seu nome:");
		stun.name = scan.nextLine();
		System.out.println("Nota 1° trimestre");
		stun.nota1 = scan.nextDouble();
		System.out.println("Nota 2° trimestre");
		stun.nota2 = scan.nextDouble();
		System.out.println("Nota 3° trimestre");
		stun.nota3 = scan.nextDouble();
		
		System.out.println(stun);

	}
}
