package ooaula8;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Quantidade de produtos");
		int n = scan.nextInt();	
		
		Product[] valueProducts = new Product[n];
		
		for ( int i = 0; i < valueProducts.length; i++) {
			System.out.println("Nome do Produto:");
			String name = scan.next();
			System.out.println("Valor do Produto:");
			double value = scan.nextDouble();
			valueProducts[i] = new Product(name, value);
		}
		
		double valueTotal = 0.0;
		for ( Product d : valueProducts) {
			valueTotal += d.getPrice();
		}
		
		double AVG = valueTotal/valueProducts.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", AVG);
		
		
		scan.close();
	}
}
