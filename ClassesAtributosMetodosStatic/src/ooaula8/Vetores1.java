package ooaula8;

import java.util.Locale;
import java.util.Scanner;

public class Vetores1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		
		double[] alturas = new double[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("Digite a altura");
			alturas[i] = scan.nextDouble();; 
		}
		
		double somaAlturas = 0;
		for (double d : alturas) {
			somaAlturas += d;
		}
		
		double media = somaAlturas/num;
		
		System.out.printf("Média das alturas: %.2f", media);
		
		scan.close();
	
	}
}
