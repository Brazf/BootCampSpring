package ooaula8;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Oi");
		int n = scan.nextInt();
		
		double[] valueProducts = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o nome do produto:");
			String name = scan.next();
			System.out.println("Digite o valor do produto:");
			valueProducts[i] = scan.nextDouble();
		}
		
		double valueTotal = 0.0;
		for ( double d : valueProducts){
			valueTotal+=d;
		}
		
		double valueAVG = valueTotal/n;
		
		System.out.printf("AVERAGE PRICE = %.2f", valueAVG);
		
		scan.close();
	}
}
