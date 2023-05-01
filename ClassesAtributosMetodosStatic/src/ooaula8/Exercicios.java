package ooaula8;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	/*
	Problema "negativos"
	Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
	Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
	e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
	*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		Problema "negativos"
		Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
		Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		
		System.out.println("Quantos números você vai digitar?");
		int quantidade = input.nextInt();
		
		int[] numInt = new int[quantidade];
		
		for(int i = 0; i < numInt.length; i++) {
			System.out.println("Digite um número:");
			numInt[i] = input.nextInt();
		}
		
		System.out.println("Numéros negativos:");
		for (int i : numInt) {
			if(i < 0) {
				System.out.println(i);
			}
		}
		
		*/
		
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
		 
		
		System.out.println("Quantos números você vai digitar?");
		int quantidade = input.nextInt();
		
		double[] numDouble = new double[quantidade];
		
		for(int i = 0; i < numDouble.length; i++) {
			System.out.println("Digite um número:");
			numDouble[i] = input.nextDouble();
		}
		
		System.out.print("valores = ");
		for (double i : numDouble) {
			System.out.print(i + " ");
		}
		
		double soma = 0;
		for (double i : numDouble) {
			soma += i;
		}
		System.out.print("\nSOMA = "+ soma);
		
		System.out.println("\nMEDIA = " + soma/quantidade);
		*/
		/*
		 Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		o vetor C gerado.
		 */
		
		System.out.println("Quantos valores vai ter cada vetor?");
		int quantidade = input.nextInt();
		
		int[] vetorA = new int[quantidade];
		int[] vetorB = new int[quantidade];
		int[] vetorC = new int[quantidade];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um número vetorA:");
			vetorA[i] = input.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite um número vetorB:");
			vetorB[i] = input.nextInt();
		}
		
		for(int i = 0; i < quantidade; i++) {
			vetorC[i] = vetorA[i]+vetorB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i : vetorC) {
			System.out.println(i);
		}
		
	}
	
}
