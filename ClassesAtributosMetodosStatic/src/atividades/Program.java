package atividades;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o valor do dólar?");
		double valorDolar = scan.nextDouble();
		System.out.println("Quantos dólares serão comprados?");
		double ComprasDolar = scan.nextDouble();
		
		CurrencyConverter conve = new CurrencyConverter(valorDolar, ComprasDolar);
		
		System.out.println(conve);
		
		scan.close();
	}
}
